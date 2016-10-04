//authors : Pavithra and silva

//RMI imports
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObstacleDetector extends HeartbeatSender {

	public String nameofOD;

	public ObstacleDetector(String name)
	{
		nameofOD = name;
	}
	public static void main(String args[]) {
		try {
	    	HeartbeatSender obj = new HeartbeatSender();
	    	HeartBeat stub = (HeartBeat) UnicastRemoteObject.exportObject(obj, 0);
	    	// Bind the remote object's stub in the registry
	    	Registry registry = LocateRegistry.getRegistry();
	    	registry.bind("Hello", stub);
	    	System.err.println("Obstacle Detector is up...");
	    } catch (Exception e) {
	    	System.err.println("Server exception: " + e.toString());
	        e.printStackTrace();
	    }
    }//main
}//class
