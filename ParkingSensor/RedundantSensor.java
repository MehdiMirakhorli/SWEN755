//authors : Pavithra and silva
//RMI imports
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//
import java.io.*;

public class RedundantSensor extends HeartbeatSender{

	public String nameofsensor;
	public RedundantSensor(String name)
	{
		nameofsensor = name;
	}

	public static void main(String args[]) {
		try {
	    	HeartbeatSender obj = new HeartbeatSender();
	    	HeartBeat stub = (HeartBeat) UnicastRemoteObject.exportObject(obj, 0);
	    	// Bind the remote object's stub in the registry
	    	Registry registry = LocateRegistry.getRegistry();
	    	registry.bind("Hello", stub);
	    	System.err.println("Redundant Sensor is up...");
	    } catch (Exception e) {
	    	System.err.println("Server exception: " + e.toString());
	        e.printStackTrace();
	    }
    }//main
}//class
