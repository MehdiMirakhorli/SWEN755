// @author Silva & Pavithra
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
public class HeartbeatReceiver
{
	int checkingInterval;
	long checkingTime;
	int expireTime;
	long lastUpdatedTime;
	public HeartbeatReceiver()
	{
		this.checkingInterval = 1000;
		this.expireTime = 4000;
	}
	public HeartbeatReceiver( int checkingInterval, int expireTime)
	{
		this.checkingInterval = checkingInterval;
		this.expireTime = expireTime;
	}
	public void checkAlive()
	{
				System.out.println("In check alive");


		this.checkingTime = System.currentTimeMillis();

		if (this.checkingTime - this.lastUpdatedTime > this.expireTime)
		{

			FaultMonitor FM = new FaultMonitor();
			FM.echo();
		}
		else
			System.out.println("HeartBeat");
	}
	public boolean pitAPat()
	{
		System.out.println("pit a pat recieved");
		this.updateTime();
		return true;
	}
	public long updateTime()
	{
		this.lastUpdatedTime = System.currentTimeMillis();
		System.out.println("update time : "+ this.lastUpdatedTime);
		return this.lastUpdatedTime;

	}
}
