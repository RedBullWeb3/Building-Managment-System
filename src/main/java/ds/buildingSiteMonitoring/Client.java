package ds.propertyMarket;

import java.awt.Dimension;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.*;

import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ds.propertyMarket.PropertyMarketGrpc.PropertyMarketBlockingStub;
import ds.propertyMarket.PropertyMarketGrpc.PropertyMarketStub;
import ds.propertyMarket.PropertyMarketServiceGrpc.PropertyMarketServiceBlockingStub;
import ds.propertyMarket.PropertyMarketServiceGrpc.PropertyMarketServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;



public class Client extends JFrame {

	private static PropertyMarketServiceBlockingStub blockingStub;
	private static PropertyMarketServiceStub asyncStub;
	private static int userInput = 0;
	private static String SERVICE_TYPE = "_propertymarket._tcp.local.";
	private static String SERVICE_NAME = "PropertyMarketService";
	private static String SERVICE_HOST = "localhost";
	private static int SERVICE_PORT = 50051;

	private JLabel PropertyAvailableLabel, TenantsVolatilityLabel;
	private static JTextField userInputField;
	private JButton setPropertyAvailableButton, sendTenantsVolatilityButton;
	private static JTextArea textArea;

	public Client() {
		super("Property Market Service");

		PropertyAvailableLabel = new JLabel("Set Property Available");
		userInputField = new JTextField(10);
		setPropertyAvailableButton = new JButton("Set");
		setPropertyAvailableButton.addActionListener(e -> SetPropertyAvailability());

		TenantsVolatilityLabel = new JLabel("Send Tenants Volatility");
		sendTenantsVolatilityButton = new JButton("Send");
		sendTenantsVolatilityButton.addActionListener(e -> SendTenantsVolatility());

		
		JPanel panel = new JPanel();
		panel.add(PropertyAvailableLabel);
		panel.add(userInputField);
		panel.add(PropertyAvailableLabel);
		panel.add(TenantsVolatilityLabel);
		panel.add(sendTenantsVolatilityButton);
		
		textArea = new JTextArea(10, 40);
		panel.add(new JScrollPane(textArea));

		add(panel);
		
		// Set the preferred size of the frame
		setPreferredSize(new Dimension(500, 300)); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}


	private Object SetPropertyAvailability() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) throws Exception {
		
		// Discovering service using JmDNS
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		ServiceInfo serviceInfo = jmdns.getServiceInfo(SERVICE_TYPE, SERVICE_NAME);
		if (serviceInfo != null) {
			SERVICE_HOST = serviceInfo.getHostAddresses()[0];
			SERVICE_PORT = serviceInfo.getPort();
			System.out.println("Discovered service: " + SERVICE_HOST + ":" + SERVICE_PORT);
		} else {
			System.out.println("Service not found");
		}
		jmdns.close();

		ManagedChannel channel = ManagedChannelBuilder.forAddress(SERVICE_HOST, SERVICE_PORT).usePlaintext().build();

		// stubs -- generate from proto file
		blockingStub = PropertyMarketServiceGrpc.newBlockingStub(channel);

		asyncStub = PropertyMarketServiceGrpc.newStub(channel);

		new Client();

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

	}

	// unary rpc
	public static void setTankTemperature() {
		userInput = Integer.parseInt(userInputField.getText());
		desiredPropertyAvailable req = desiredPropertyAvailable.newBuilder().setDesiredAvailable(userInput).build();

		// retrieving reply from service
		PropertyAvailableConfirm response = blockingStub.setPropertyAvailability(req);

		System.out.println("Server response: " + response.getConfirmation());
		textArea.append(response.getConfirmation() + "\n");

    
	//	JOptionPane to test response
	//	JOptionPane.showMessageDialog(null, "Tank temperature set to " + response.getConfirmation());
	}

	// client side streaming
	public static void SendTenantsVolatility() {
		StreamObserver<TenantsVolatilityResponse> responseObserver = new StreamObserver<TenantsVolatilityResponse>() {

			public void onNext(TenantsVolatilityResponse msg) {
				System.out.println("Receiving tenants volatility level ");
				System.out.println("Recommendation based on incoming data: " + msg.getRecommendation());
				String message = "Recommendation based on incoming data:\n" + msg.getRecommendation();
				textArea.append(message);

			// JOptionPane for testing response
			//	JOptionPane.showMessageDialog(null, message);
	
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Stream is completed ... receiving converted info");

			}

		};

		StreamObserver<TenantsVolatilityRequest> requestObserver = asyncStub.sendTenantsVolatility(responseObserver);
		// create random numbers for input
		Random rand = new Random();

		for (int i = 0; i < 5; i++) {
			try {
				requestObserver.onNext(TenantsVolatilityRequest.newBuilder().setFreePropertyAvailable(rand.nextInt(60) + 40) 
						.setTenantsNumber(rand.nextInt(700) + 300) 
						.setOccupiedProperties(rand.nextInt(10) + 5) 
						.setWaitingQueue(rand.nextInt(30) + 20) 
						.build());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}

		// Mark the end of requests
		requestObserver.onCompleted();

	}

}
