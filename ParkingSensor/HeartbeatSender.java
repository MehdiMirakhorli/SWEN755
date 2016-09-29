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


	public String sendMessage ()
	{
		try
		{
				Thread.sleep(sendingInterval);
				HeartbeatReceiver HBR = new HeartbeatReceiver();
				HBR.pitAPat();
		}
		catch(InterruptedException e){}
		return "I'm Alive";
	}
	public void run() {
	}//run
}// class
