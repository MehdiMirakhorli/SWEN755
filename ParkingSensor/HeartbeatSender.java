/**
 * @author Silva & Pavithra
 *
 */
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;
import java.util.*;

public class HeartbeatSender extends TimerTask implements Runnable{
	int sendingInterval;
	public HeartbeatSender()
	{
		this.sendingInterval = 1000;
	}
	public HeartbeatSender (int sendingInterval)
	{
		this.sendingInterval = sendingInterval;
	}

	public void sendMessage ()
	{
		this.run();
	}//send msg
	public void run() {
					Date now;
					while(true)
					{

						try
						{
							Thread.sleep(sendingInterval);
							HeartbeatReceiver HBR = new HeartbeatReceiver();
							HBR.pitAPat();
							now = new Date();
							System.out.println("I am alive \n " + now);
						}
						catch (InterruptedException e)
						{}
					}// end while
			}//run
}// class
