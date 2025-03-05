import becker.robots.City;
import becker.robots.Direction;

/**
 * The DoubleClimber class extends the Climber class and represents a robot that can climb hills and plant things.
 * This class overrides the climbAndPlant, climbHill, and downHill methods to provide specific functionality for the DoubleClimber.
 * Constructor:
 * @param city the city where the robot is located
 * @param street the initial street position of the robot
 * @param avenue the initial avenue position of the robot
 * @param direction the initial direction the robot is facing
 * @param things the number of items the robot carries
 * 
 * 
 * Methods:
 * - climbAndPlant(): Moves the robot, plants items, climbs a hill, plants items, descends the hill, and plants items.
 * - climbHill(): Climbs a hill by moving and turning left and right in a specific pattern.
 * - downHill(): Descends a hill by moving and turning right and left in a specific pattern.
 */
 
public class DoubleClimber extends Climber{
    DoubleClimber(City city, int street, int avenue, Direction direction, int things){
        super(city, street, avenue, direction, things);
    }

    @Override
    public void climbAndPlant() {
        // TODO Auto-generated method stub
        move();
        move();
        plant(2);
        climbHill();
        plant(2);
        downHill();
        plant(2);        
    }

    @Override
    public void climbHill() {
        // TODO Auto-generated method stub
        for(int i = 0; i < 2; i++){
            this.turnLeft();
            this.move();
            this.turn_Right();  
            this.move();
        }        
    }

    @Override
    public void downHill() {
        // TODO Auto-generated method stub
        for(int i = 0; i < 2; i++){
            this.move();
            this.turn_Right();
            this.move();
            this.turnLeft();
        }
    }

}
