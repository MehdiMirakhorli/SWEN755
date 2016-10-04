//authors : Pavithra and silva
//RMI imports
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RedundantObstacleDetector extends HeartbeatSender{

	public String nameofROD;

	public RedundantObstacleDetector(String name)
	{
		nameofROD = name;
	}

	public static void main(String args[]) {
		try {
	    	HeartbeatSender obj1 = new HeartbeatSender();
	    	HeartBeat stub1 = (HeartBeat) UnicastRemoteObject.exportObject(obj1, 1);
	    	// Bind the remote object's stub in the registry
	    	Registry registry = LocateRegistry.getRegistry();
	    	registry.bind("Hell", stub1);
	    	System.err.println("Redundant Obstacle Detector is up...");

	    } catch (Exception e) {
	    	System.err.println("Server exception: " + e.toString());
	        e.printStackTrace();
	    }
    }//main
}//class
