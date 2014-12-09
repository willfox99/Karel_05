import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab05 {

public static void runTheRace(Racer arg) {
         arg.shuttle(4, 7);
         arg.shuttle(6, 5);
         arg.shuttle(8, 3);
         arg.move();
     }
          public static void main(String[] args) {   
     
            Display.openWorld("maps/shuttle.map");
            Display.setSize(10, 10);
            Display.setSpeed(10);
            
            Racer will = new Racer(7);
            Racer david = new Racer (4);
            Racer fox = new Racer(1);
            runTheRace(will);
            runTheRace(david);
            runTheRace(fox);
            
   }  

}	
	
     