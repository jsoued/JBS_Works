
import java.awt.Color;

//Creates subclass of superclass AbstractBird.
public class Bluebird extends AbstractBird{

	private static final Color COL = Color.BLUE;
	private boolean j = true;
	private int i = 0;
	
	//Constructor: calls from superclass. Increases count of birds.
	public Bluebird(int x, int y){
	
		super(x,y);
		super.countbird++;
	}
	
	//This method returns the color of the bird according to the fied above.
	public Color getColor(){
		
		return COL;
	}
	
	//This method makes the bird to move.
	public void fly(){
		
		//If the bird hits the rightward limit, turn direction.
		if (super.p.x == 19){
		
			j = false;
		}
		
		//If the bird hits the leftward limit, turn direction.
		if (super.p.x == 0){
		
			j = true;
		}
		
		//If the bird is moving to the right.
		if (j == true){
		
			//Move to the right one position.
			super.p.x = super.p.x + 1;
			
			//Start moving up (while also horizontally).
			if (i == 0){
			
				//Move one position and change value of i.
				super.p.y = super.p.y - 1;
				i = 1;
				
				//Move down (while also horizontally).
				} else {
				
				//Move one position and change value of i.
				super.p.y = super.p.y + 1;
				i = 0;
				
				}
			
			//If the bird is moving to the left.
			} else {
			
			//Move to the left one position.
			super.p.x = super.p.x - 1;
			
			//Start moving up (while also horizontally).
			if (i == 0){
			
				//Move one position and change value of i.
				super.p.y = super.p.y - 1;
				i = 1;
				
				//Move down (while also horizontally).
				} else {
				
				//Move one position and change value of i.
				super.p.y = super.p.y + 1;
				i = 0;
			
				}		
			}
			
			//Increase count of flights.
			super.countfly++;
	}
}