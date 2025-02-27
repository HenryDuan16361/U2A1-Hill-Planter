/**
 Write a program that will plant things in a field that has six rows and six columns. We want the odd
numbered rows (first, third, and fifth) to have two things on each corner and we want the other rows to
have three things on each corner. In addition, the Robot will spin after each plant according to the
number of things it planted (ie. if it plant two things, it will spin twice before moving to the next corner)

 * @author YOU
 */
import becker.robots.*;

public class RobotTask {


	/**
	 * runs robot task to complete the planting
	 */
	public void run() {

		// build a random city called waterloo
		City field = new City("PlantHills.wld");
		field.showThingCounts(true);
		
		Robot rob = new Robot(field, 6,0,Direction.EAST,50);
	

	

	}
}