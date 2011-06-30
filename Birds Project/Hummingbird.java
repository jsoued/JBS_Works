
import java.awt.Color;
import java.util.*;

//Creates subclass of superclass AbstractBird.
public class Hummingbird extends AbstractBird{

	private static final Color COL = Color.MAGENTA;

	//Constructor: calls from superclass. Increases count of birds.
	public Hummingbird(int x, int y){
	
		super(x,y);
		super.countbird++;
	}
	
	//This method returns the color of the bird according to the fied above.
	public Color getColor(){
		
		return COL;
	}
	
	//This method makes the bird to move.
	public void fly(){
		
		//Creates random object.
		Random rand = new Random();
		
		//Saves in x and y, respectively, random numbers from 0 - 19.
		super.p.x = rand.nextInt(20);
		super.p.y = rand.nextInt(20);
		
		//Increase count of flights.
		super.countfly++;
	}
}