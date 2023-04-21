package ds.propertyMarket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.propertyMarket.PropertyMarketGrpc.PropertyMarketImplBase;
import ds.propertyMarket.PropertyMarketServiceGrpc.PropertyMarketServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class PropertyMarketService extends PropertyMarketServiceImplBase {

	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyMarketService propertymarket = new PropertyMarketService();

		Properties prop = propertymarket.getProperties();

		propertymarket.registerService(prop);

		int port = Integer.valueOf(prop.getProperty("service_port")); // #50051

		try {

			Server server = ServerBuilder.forPort(port).addService(propertymarket).build().start();

			System.out.println("Property Market server started, listening on " + port);

			server.awaitTermination();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Properties getProperties() {

		Properties prop = null;

		try (InputStream input = new FileInputStream("src/main/resources/propertyMarket.properties")) {

			prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println("PropertyMarket properies ...");
			System.out.println("\t service_type: " + prop.getProperty("service_type"));
			System.out.println("\t service_name: " + prop.getProperty("service_name"));
			System.out.println("\t service_description: " + prop.getProperty("service_description"));
			System.out.println("\t service_port: " + prop.getProperty("service_port"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return prop;
	}
	

	private void registerService(Properties prop) {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			String service_type = prop.getProperty("service_type");// "_http._tcp.local.";
			String service_name = prop.getProperty("service_name");// "example";
			int service_port = Integer.valueOf(prop.getProperty("service_port"));// #.50051;

			String service_description_properties = prop.getProperty("service_description");// 
			
			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
					service_description_properties);
			jmdns.registerService(serviceInfo);

			System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

			// Wait a bit
			Thread.sleep(1000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setPropertyAvailability(desiredPropertyAvailable request, StreamObserver<PropertyAvailableConfirm> responseObserver) {

		System.out.println("receiving Set Property Availability method " + request.getDesiredAvailable());

		Random rand = new Random();
		int currentPropertyAvailable = rand.nextInt(101);

		int newPropertyAvailable = request.getDesiredAvailable();

		// Code to set the tank temperature to the desired temperature
		String confirmation = "Tenants Volatility is now setting to " + newPropertyAvailable + " from " + currentPropertyAvailable;

		PropertyAvailableConfirm response = PropertyAvailableConfirm.newBuilder().setConfirmation(confirmation).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}



	 public StreamObserver<TenantsVolatilityRequest> sendTenantsVolatility(StreamObserver<TenantsVolatilityResponse> responseObserver) {
	        return new StreamObserver<TenantsVolatilityRequest>() {
	            ArrayList<Integer> free = new ArrayList<Integer>();
	            ArrayList<Integer> tenants = new ArrayList<Integer>();
	            ArrayList<Integer> occupied = new ArrayList<Integer>();
	            ArrayList<Integer> queue = new ArrayList<Integer>();


	            @Override
	            public void onNext(TenantsVolatilityRequest request) {
	                System.out.println("receiving current property data values: "+ "\n" + "Properties Available: " + request.getFreePropertyAvailable() + "\n" + " Tank level: " + request.getTenantsNumber() + "\n" + " Flow rate: " + request.getOccupiedProperties() + " Water pressure: " + request.getWaitingQueue());
	                free.add(request.getFreePropertyAvailable());
	                tenants.add(request.getTenantsNumber());
	                occupied.add(request.getOccupiedProperties());
	                queue.add(request.getWaitingQueue());
	            }

	            @Override
	            public void onError(Throwable t) {
	                // TODO Auto-generated method stub
	            }

	            @Override
	            public void onCompleted() {
	                System.out.printf("receiving Tenants Volatility data method complete \n");
	                String message = "";
	                String message2 = "";
	                String message3 = "";
	                String message4 = "";

	                for (int freeValue : free) {
	                    if (freeValue < 65) {
	                        message = "\n" + "Check free apartments: " + freeValue + " apartments recorded. ";
	                        break;
	                    } else {
	                        message ="\n" + "Tenants Volatility OK. ";
	                    }
	                }
	                for (int tenantsLevel : tenants) {
	                    if (tenantsLevel < 600) {
	                        message2 = "\n"+ "Check tenants level: " + tenantsLevel + " tenants recorded. ";
	                        break;
	                    } else {
	                        message2 ="\n" + "Tenants Level OK. ";
	                    }
	                }
	                for (int occupiedProperties : occupied) {
	                    if (occupiedProperties < 9) {
	                        message3 ="\n" + "Occupied properties: " + occupiedProperties + " Occupied properties recorded. ";
	                        break;
	                    } else {
	                        message3 ="\n" + "Occupied Properties OK. ";
	                    }
	                }
	                for (int waitingQueue : queue) {
	                    if (waitingQueue < 40) {
	                        message4 ="\n" + "Waiting Queue issue: " + waitingQueue + " Waiting tenants recorded. ";
	                        break;
	                    } else {
	                        message4 ="\n" + "Waiting queue OK. ";
	                    }
	                }
	                String result = message + message2 + message3 + message4;
	                System.out.println(result);
	                TenantsVolatilityResponse reply = TenantsVolatilityResponse.newBuilder().setRecommendation(result).build();
	                responseObserver.onNext(reply);
	                responseObserver.onCompleted();
	            }
	        };
	    }
	}