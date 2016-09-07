import java.io.*;
import java.net.*;
public class Sensor extends Thread{

	/* int sensorID;
	String sensorLocation;
	int  periodicity; // checking intervals for sensor */
	public static int heartbeatPort = 1234;

	public String nameofsensor;
	public Sensor(String name)
	{
		nameofsensor = name;
	}
	public static int randgen(int min, int max) {
		    Random ran = new Random();
		    int Num = ran.nextInt((max - min) + 1) + min;
		    System.out.println("Random number is " + Num + "\n");
		    return Num;
	}
	public void run()
	{
		Thread tSender = new Thread(new HeartbeatSender());
		tSender.start();

		//for synchronizing the sender and receiver, sockets can be used

		try(ServerSocket ss = new ServerSocket(heartbeatPort,1);) // backlog value set to 1 (queue)
		{
			System.out.println("Inside sensor processing..");

					int a = randgen(0,10);
					while(a!=0)
					{
						try(Socket cs = ss.accept();
							BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()))
						{
							String sensorBeat;
							while((sensorBeat = br.readLine()) != null)
							{
								System.out.println("\n" + "Sensor" + nameofsensor + "alive" + "\n");
							a = randgen(0,10);
						}}
						catch (InterruptedException e)
						{System.err.println(e.getMessage());
					}
			}
		}//try
		catch(IOException Ex1)
		{
			System.err.println(Ex1.getMessage());
		}
		finally
		{
			System.err.println("Bad application");
			tSender.interrupt();
		}
	
}//run
}//class
