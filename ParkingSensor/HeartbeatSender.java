/**
 * @author Silva & Pavithra
 *
 */
//RMI imports
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;
import java.util.*;

public class HeartbeatSender extends TimerTask implements Runnable, HeartBeat{
	int sendingInterval;
	public HeartbeatSender()
	{
		this.sendingInterval = 1000;
	}
	public HeartbeatSender (int sendingInterval)
	{
		this.sendingInterval = sendingInterval;
	}

	public static int randgen(int min, int max) {
	    Random ran = new Random();
	    int Num = ran.nextInt((max - min) + 1) + min;
	    System.out.println("\n" + "Random number is " + Num );
	    return Num;
	}
	public String sendMessage ()
	{
		Date now;
		int a = randgen(0,3);
		while(a!=0)
	{
			try
			{
				Thread.sleep(sendingInterval);
				HeartbeatReceiver HBR = new HeartbeatReceiver();
				HBR.pitAPat();
				now = new Date();
				a = randgen(0,3);
			}
			catch (InterruptedException e)
			{}
		}// end while
		return "I am totally dead";
	}
	public void run() {
	}//run
}// class
