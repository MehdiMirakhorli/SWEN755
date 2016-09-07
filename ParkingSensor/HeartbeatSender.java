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

	public static int randgen(int min, int max) {


	    Random ran = new Random();

	    int Num = ran.nextInt((max - min) + 1) + min;
	    System.out.println("Random number is " + Num + "\n");

	    return Num;
}
	public void sendMessage ()
	{
			this.run();


	}//send msg
	public void run() {
					Date now;
					int a = randgen(0,10);
					while(a!=0)
					{

						try
						{
							Thread.sleep(sendingInterval);
							HeartbeatReceiver HBR = new HeartbeatReceiver();
							HBR.pitAPat();
							now = new Date();
							System.out.println("I am alive \n " + now);
							a = randgen(0,10);
						}
						catch (InterruptedException e)
						{}
					}// end while
			}//run
}// class
