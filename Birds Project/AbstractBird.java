
import java.awt.Point;

//Creatin abstract class implementing interface Bird.
public abstract class AbstractBird implements Bird{

	//Fields: keep counts of flights and birds, and point for position.
	protected int countbird = 0;
	protected int countfly = 0;
	protected Point p;

	//Constructor: builds the object.
	public AbstractBird (int x, int y){
	
		this.p = new Point(x, y);
	}
	
	//This method returns the point that represents the position of the bird.
	public Point getPosition(){
	
		return p;
	}
}