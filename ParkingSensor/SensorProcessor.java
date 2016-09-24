//authors : Pavithra and silva
import java.io.*;
//RMI imports
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//
public class SensorProcessor extends HeartbeatReceiver{

	public String nameofsensor;
	public SensorProcessor()
	{
	}
	public static void main(String[] args) {

	        String host = (args.length < 1) ? null : args[0];
	        try {
	            Registry registry = LocateRegistry.getRegistry(host);
	            HeartBeat stub = (HeartBeat) registry.lookup("Hello");
	            //String response = stub.sendMessage();
	            stub.sendMessage();
	            //System.out.println("response: " + response);
	        } catch (Exception e) {
	            System.err.println("Client exception: " + e.toString());
	            e.printStackTrace();
	        }
    }

}//class
