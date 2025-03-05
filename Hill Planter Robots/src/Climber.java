import becker.robots.City;
import becker.robots.Direction;
import becker.robots.*;

/*
 * The Climber class is an abstract subclass of Robot that provides 
 * additional functionality for climbing and planting things in a City.
 * It defines abstract methods for climbing and planting, as well as 
 * concrete methods for turning right and planting a specified number of things.
 * It includes methods for climbing and descending hills, turning right, 
 * and planting a specified number of things.
 */
public abstract class Climber extends Robot{
    Climber(City city, int street, int avenue, Direction direction, int things){
        super(city, street, avenue, direction, things);
    }

    public abstract void climbAndPlant();

    public abstract void downHill();
    public abstract void climbHill();   

    public void turn_Right(){
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    }

    public void plant(int n){
        for(int i = 0; i < n; i++){
            this.putThing();
        }
    }
    

}

