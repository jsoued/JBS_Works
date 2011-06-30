
import java.awt.Color;

//Creates subclass of superclass AbstractBird.
public class Vulture extends AbstractBird{

	private static final Color COL = Color.BLACK;
	private int i = 0;
	
	//Constructor: calls from superclass. Increases count of birds.
	public Vulture(int x, int y){
	
		super(x,y);
		super.countbird++;
	}
	
	//This method returns the color of the bird according to the fied above.
	public Color getColor(){
		
		return COL;
	}
	
	//This method makes the bird to move.
	public void fly(){
		
		//If bird is facing up.
		if (i == 0){
			
			//Move up one position and change direction (i).
			super.p.y = super.p.y - 1;
			i = 1;
			
			//If bird is facing to the left.
			} else if (i == 1){
		
			//Move to the left one position and change direction (i).
			super.p.x = super.p.x - 1;
			i = 2;
			
			//If bird is facing down.
			} else if (i == 2){
		
			//Move down right one position and change direction (i).
			super.p.y = super.p.y + 1;
			i = 3;
			
			//If bird is facing to the right.
			} else if (i == 3){
		
			//Move to the right one position and change direction (i).
			super.p.x = super.p.x + 1;
			i = 0;
		}
		
		//Increase count of flights.
		super.countfly++;
	}
}