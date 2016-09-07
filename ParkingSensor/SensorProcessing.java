
public class SensorProcessing extends Thread
{


	public static void main(String args[])
	{
	Thread tReceiver = new Thread(new HeartbeatReceiver());
		tReceiver.start();
		System.out.println("Receiver..");
		Sensor front = new Sensor("front");
		//public static rear = new Sensor("rear");
		//public static blindSpot = new Sensor("blindSpot");

	}
}