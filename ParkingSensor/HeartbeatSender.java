/**
 * @author Silva & Pavithra
 *
 */
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;
import java.util.*;
//import java.text.SimpleDateFormat;
//import com.sun.jmx.snmp.Timestamp;

public class HeartbeatSender extends TimerTask{
	int sendingInterval;
	//
	public HeartbeatSender()
	{
		this.sendingInterval = 1000; // 1 second
	}
	//
	public HeartbeatSender (int sendingInterval)
	{
		this.sendingInterval = sendingInterval;
	}

	public void sendMessage ()
	{
		this.run();
	}//send msg
	public void run() {
					Date now; // to display current time
					while(true)
					{
						//code to run
						try
						{
							long millis = System.currentTimeMillis();
							Thread.sleep(1000 - millis % 1000);
							HeartbeatReceiver HBR = new HeartbeatReceiver();
							HBR.pitAPat();
							now = new Date(); // initialize date
							System.out.println("Sending msg loop " + now);// Display current time
						}
						catch (InterruptedException e)
						{}
					}// end while
			}//run
}// class
