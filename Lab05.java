/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
	
	public static void runTheRace(Racer r) {
		r.shuttle(4, 7);
		r.shuttle(6, 5);
		r.shuttle(8, 3);
		r.move();
	}

     public static void main(String[] args) {
          Display.openWorld("maps/shuttle.map");
          Display.setSize(10, 10);
          Racer abby = new Racer(1);
          Racer bobby = new Racer(4);
          Racer carol = new Racer(7);
          runTheRace(abby);
          runTheRace(bobby);
          runTheRace(carol);
     }
}
