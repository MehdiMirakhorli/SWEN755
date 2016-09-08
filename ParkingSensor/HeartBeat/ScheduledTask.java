import java.util.TimerTask;
import java.util.Date;
/**
 *
 * @author Dhinakaran P.
 */
// Create a class extends with TimerTask
public class ScheduledTask extends TimerTask {

	Date now; // to display current time

	// Add your task here
	public void run() {
		while(true) {
		long millis = System.currentTimeMillis();
		    //code to run
		    //try
		    //{
    		//Thread.sleep(1000 - millis % 1000);
			now = new Date(); // initialize date
			System.out.println("Time is :" + now); // Display current time
			//}
			//catch (InterruptedException e)
			//{}

}// end while
	}
}