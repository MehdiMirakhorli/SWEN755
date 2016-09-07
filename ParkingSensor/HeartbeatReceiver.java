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
		try {
			Thread.sleep(checkingInterval);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.checkingTime = System.currentTimeMillis();
		if (this.checkingTime - this.lastUpdatedTime > this.expireTime)
		{
			System.out.println("beating");
		}
		else{
			FaultMonitor FM = new FaultMonitor();
			FM.echo();
		}
	}//checkAlive
	public boolean pitAPat()
	{
		System.out.println("pit a pat recieved");
		this.updateTime();
		return true;
	}//pitAPat
	public long updateTime()
	{
		this.lastUpdatedTime = System.currentTimeMillis();
		System.out.println("update time : "+ this.lastUpdatedTime);
		return this.lastUpdatedTime;
	}//updateTime
}
