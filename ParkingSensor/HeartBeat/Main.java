

/**
 * @author silva &Pavithra
 *
 */
public class Main {

	public static void main(String args[])
	{

		HeartbeatSender HBS = new HeartbeatSender();
		HeartbeatReceiver HBR  = new HeartbeatReceiver();
		new Thread(() -> HBS.sendMessage()).start();
    	new Thread(() -> HBR.checkAlive()).start();
	}
}
