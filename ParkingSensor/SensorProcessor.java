//authors : Pavithra and silva
import java.io.*;
import java.util.*;
//RMI imports
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//
public class SensorProcessor extends HeartbeatReceiver{

	public String nameofsensor;
	public SensorProcessor()
	{
	}
	// Random nubmer generator for fault injection
	public static int randgen(int min, int max) {
		    Random ran = new Random();
		    int Num = ran.nextInt((max - min) + 1) + min;
		    System.out.println("\n" + "Random number is " + Num );
		    return Num;
	}

	public static void main(String[] args) {

	        String host = (args.length < 1) ? null : args[0];
	        try {
	            Registry registry = LocateRegistry.getRegistry(host);
	            HeartBeat stub = (HeartBeat) registry.lookup("Hello");
	            Date now;
				int a = randgen(0,3);
				while(true)
				{
					if (a!=0)
					{
						String response = stub.sendMessage();
						long setUpdatedTime = System.currentTimeMillis();
						HeartbeatReceiver HBR = new HeartbeatReceiver();
						HBR.checkAlive(setUpdatedTime);
						System.out.println("response: " + response);
						now = new Date();
						a = randgen(0,3);
					}
					else
					{
						FaultMonitor FM = new FaultMonitor();
						FM.echo();
						break;
					}
				}//end while
	        } catch (Exception e) {
	            System.err.println("Client exception: " + e.toString());
	            e.printStackTrace();
	        }
    }

}//class
