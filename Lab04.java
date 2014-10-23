/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

     public static void main(String[] args) {
             Display.openWorld("maps/first.map");
   Display.setSize(10, 10);
   Display.setSpeed(3);
   Robot karel = new Robot();
   karel.move();
   karel.move();
     }
}
