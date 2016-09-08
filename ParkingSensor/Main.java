/**
 * @author silva &Pavithra
 *
 */
 import java.util.TimerTask;
 import java.util.Date;
 import java.util.Timer;
 import java.util.*;
public class Main {

	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Fault detection Tactic");
		Sensor HBS = new Sensor("FrontSensor");
		SensorProcessor HBR  = new SensorProcessor();
		Thread t1 = new Thread(() -> HBS.sendMessage());
		t1.start();

		t1.join();
		long setUpdatedTime = System.currentTimeMillis();
    	Thread t2 = new Thread(() -> HBR.checkAlive(setUpdatedTime));
    	t2.start();
    	t2.join();
	}
}
