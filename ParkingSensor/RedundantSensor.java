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
	    	HeartbeatSender obj1 = new HeartbeatSender();
	    	HeartBeat stub1 = (HeartBeat) UnicastRemoteObject.exportObject(obj1, 1);
	    	// Bind the remote object's stub in the registry
	    	Registry registry = LocateRegistry.getRegistry();
	    	registry.bind("Hell", stub1);
	    	System.err.println("Redundant Sensor is up...");

	    } catch (Exception e) {
	    	System.err.println("Server exception: " + e.toString());
	        e.printStackTrace();
	    }
    }//main
}//class
