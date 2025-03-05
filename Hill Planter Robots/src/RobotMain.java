
/**
 * The RobotMain class serves as the entry point for the Hill Planter Robots application.
 * It initializes and starts three separate tasks (RobotTask1, RobotTask2, and RobotTask3)
 * in separate threads.
 * 
 * <p>Execution flow:</p>
 * <ul>
 *   <li>Prints "start" to the console.</li>
 *   <li>Creates and runs a thread for RobotTask1.</li>
 *   <li>Creates and runs a thread for RobotTask2.</li>
 *   <li>Creates and runs a thread for RobotTask3.</li>
 *   <li>Prints "end" to the console.</li>
 * </ul>
 * 
 * <p>Note: The tasks are run sequentially in the current implementation because the run() method
 * is called directly. To run them concurrently, the start() method should be used instead.</p>
 *
 * It initializes a RobotTask instance and starts its execution.
 * 
 * <p>This class contains the main method which is the starting point of the Java application.</p>
 * 
 * Usage:
 * <pre>
 * {@code
 * public static void main(String[] args) {
 *     RobotTask task = new RobotTask();
 *     System.out.println("start");
 *     task.run();
 * }
 * }
 * </pre>
 * 
 * @see RobotTask
 */
public class RobotMain {

	public static void main(String[] args) {
		System.out.println("start");
		Thread task1 = new Thread((Runnable) new RobotTask1());
		task1.run();
		Thread task2 = new Thread((Runnable) new RobotTask2());
		task2.run();
		Thread task3 = new Thread((Runnable) new RobotTask3());
		task3.run();
		System.out.println("end");
		
	}

}
