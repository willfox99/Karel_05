import edu.fcps.karel2.Display;

/**
*  <Describe what the Racer class does>
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

public class Racer extends Athlete {

	public Racer(int y) {
		super(1, y, Display.EAST, Display.INFINITY);
	}
	
	public void jumpRight() {
		// Pseudocode: tL, m, tR, m, tR, m, tL
	}
	
	public void jumpLeft() {
		
	}
	
	public void sprint(int n) {
		for (int k = 1; k<=n; k++) {
			move();
		}
	}
	
	public void put(int n) {
		//TODO Place n beepers
	}
	
	public void pick(int n) {
		//TODO Pick up n beepers
	}
	
	/**
	 * Racers shuttle by moving forward, jumping any hurdles along the way, and collecting
	 * the required number of beepers.  Racers then return to their starting position and
	 * deposit the collected beepers.  Finally, Racers face East to complete the shuttle.
	 * 
	 * @param spaces
	 * @param beepers
	 */
	public void shuttle(int spaces, int beepers) {
		//TODO Perform a complete shuttle sequence
	}

}
