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
	public void checkAlive(long lastUpdatedTime)
	{
		while(true){

		//System.out.println("In check alive");
		try {
			Thread.sleep(checkingInterval);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.checkingTime = System.currentTimeMillis();
		// this.lastUpdatedTime = updateTime();
		//System.out.println("set updated time"+lastUpdatedTime+"\n"+"Checking time"+checkingTime+"\n"+"subt"+(checkingTime - lastUpdatedTime));
		if (checkingTime - lastUpdatedTime < expireTime)
		{
			System.out.println("\n" + "beating");
		}
		else{
			FaultMonitor FM = new FaultMonitor();
			FM.echo();
			break;
		}}
	}//checkAlive
	public boolean pitAPat()
	{
		System.out.println("\n" + "beating");
		this.updateTime();
		return true;
	}//pitAPat
	public long updateTime()
	{
		this.lastUpdatedTime = System.currentTimeMillis();

		//System.out.println("update time : "+ this.lastUpdatedTime);
		return this.lastUpdatedTime;
	}//updateTime


}
