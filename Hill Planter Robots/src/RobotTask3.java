/**
 Write a program that will plant things in a field that has six rows and six columns. We want the odd
numbered rows (first, third, and fifth) to have two things on each corner and we want the other rows to
have three things on each corner. In addition, the Robot will spin after each plant according to the
number of things it planted (ie. if it plant two things, it will spin twice before moving to the next corner)

 * @author YOU
 */
import becker.robots.*;

/**
 * The RobotTask class is responsible for executing a series of tasks
 * involving robot climbers that plant seeds in a simulated city.
 * 
 * <p>This class creates a city environment, initializes different types
 * of climber robots, and instructs them to perform planting tasks.
 * 
 * <p>Usage example:
 * <pre>
 * RobotTask task = new RobotTask();
 * task.run();
 * </pre>
 * 
 * <p>Dependencies:
 * <ul>
 *   <li>City class for creating the city environment.</li>
 *   <li>DoubleClimber and TripleClimber classes for robot operations.</li>
 * </ul>
 * 
 * <p>Note: The city environment is loaded from a file named "PlantHills.wld".
 * 
 * @see City
 * @see DoubleClimber
 * @see TripleClimber
 */
public class RobotTask3 implements Runnable{


	/**
	 * runs robot task to complete the planting
	 */
	public void run() {

		// build a random city called waterloo
		City field = new City("PlantHills.wld");
		field.showThingCounts(true);
		
		Climber karel = null;
		// create a new robot	
		karel = new DoubleClimber(field, 6,22, Direction.EAST, 50);
		karel.climbAndPlant();

	

	}
}