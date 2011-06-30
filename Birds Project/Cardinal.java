
import java.awt.Color;

//Creates subclass of superclass AbstractBird.
public class Cardinal extends AbstractBird {

	private static final Color COL = Color.RED;
	private boolean j = true;

	//Constructor: calls from superclass. Increases count of birds.
	public Cardinal(int x, int y){
	
		super(x,y);
		super.countbird++;
	}
	
	//This method returns the color of the bird according to the fied above.
	public Color getColor(){
	
		return COL;
	}
	
	//This method makes the bird to move.
	public void fly(){

		//If bird hits upper limit, change direction.
		if (super.p.y == 0){
		
			j = false;
		}
		
		//If bird hits lower limit, change direction.
		if (super.p.y == 19){
		
			j = true;
		}
		
		//If the bird is moving uppwards.
		if (j == true){
		
			//Move one position uppwards.
			super.p.y = super.p.y - 1;
			
			//If bird is moving downwards.
			} else {
			
			//Move one position downwards.
			super.p.y = super.p.y + 1;
			
			}	
		
		//Increase count of flights.
		super.countfly++;
	}
}