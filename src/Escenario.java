
/**
 * Juan Jose 
 * **Recordar importar la libreria becker
 */
import becker.robots.*;
import java.awt.Color;
public class Escenario {
    private final City ciudad;
    private Robot robot;
    /**
     * 
     */
    public Escenario(){
        this.ciudad = new City();
        for(int i = 1; i <= 6; i++){
              Wall pared = new Wall(ciudad,i,2, Direction.WEST);
              Wall pared2 = new Wall(ciudad,i,7, Direction.EAST);
        }
        for(int i = 2; i <=7; i++){
             Wall pared = new Wall(ciudad,1,i, Direction.NORTH);  
             Wall pared2 = new Wall(ciudad,6,i, Direction.SOUTH);
        }
        for(int i = 6; i >=1; i++){
           Thing thing = new Thing(this.ciudad,5 ,5);
           thing.getIcon().setColor(Color.RED);
           thing.getIcon().setLabel("TO");
           
           this.robot = new Robot(ciudad, 4, 4, Direction.EAST);
           this.robot.setLabel("ROBOT");
        }
    }
}