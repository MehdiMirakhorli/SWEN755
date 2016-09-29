//authors : Pavithra and silva
//RMI imports
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//
import java.io.*;
// This class observes active node
public class RedundantSensor extends HeartbeatSender{

	public String nameofsensor;
//	private Subject topic;
	public RedundantSensor(String name)
	{
		nameofsensor = name;
	}
/*
					@Override
					public void update() {
						String msg = (String) topic.getUpdate(this);
						if(msg == null){
							System.out.println(name+":: No new message");
						}else
						System.out.println(name+":: Consuming message::"+msg);
					}

					@Override
					public void setSubject(Subject sub) {
						this.topic=sub;
					}*/


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
