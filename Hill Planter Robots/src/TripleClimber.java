import becker.robots.City;
import becker.robots.Direction;

/**
 * TripleClimber is a specialized Climber robot that climbs hills and plants items.
 * It moves in a city, climbs hills, and plants items at specific intervals.
 * 
 * Constructor:
 * @param city the city where the robot is located
 * @param street the initial street position of the robot
 * @param avenue the initial avenue position of the robot
 * @param direction the initial direction the robot is facing
 * @param things the number of items the robot carries
 * 
 * Methods:
 * - climbAndPlant(): Moves the robot, plants items, climbs a hill, plants items, descends the hill, and plants items.
 * - climbHill(): Climbs a hill by moving and turning left and right in a specific pattern.
 * - downHill(): Descends a hill by moving and turning right and left in a specific pattern.
 */
public class TripleClimber extends Climber{
    TripleClimber(City city, int street, int avenue, Direction direction, int things){
        super(city, street, avenue, direction, things);
    }

    @Override
    public void climbAndPlant() {
        // TODO Auto-generated method stub
        move();
        move();
        plant(3);
        climbHill();
        plant(3);
        downHill();
        plant(3);        
    }

    @Override
    public void climbHill() {
        // TODO Auto-generated method stub
        for(int i = 0; i < 3; i++){
            this.turnLeft();
            this.move();
            this.turn_Right();  
            this.move();
        }        
    }

    @Override
    public void downHill() {
        // TODO Auto-generated method stub
        for(int i = 0; i < 3; i++){
            this.move();
            this.turn_Right();
            this.move();
            this.turnLeft();
        }
    }

}
