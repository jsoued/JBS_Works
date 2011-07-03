package de.vogella.junit.first;

import java.awt.Color;
import java.awt.Point;
import java.util.*;

public class Hummingbird {

	private static final Color COL = Color.MAGENTA;
	protected int countbird = 0;
	protected int countfly = 0;
	protected Point p;

	public Hummingbird(int x, int y){

		this.p = new Point(x, y);
		countbird++;
	}

	//This method returns the color of the bird.
	public Color getColor(){

		return COL;
	}

	//This method makes the bird to move.
	public int fly(){

		//Creates random object.
		Random rand = new Random();

		//Saves in x and y, respectively, random numbers from 0 - 19.
		p.x = rand.nextInt(20);
		p.y = rand.nextInt(20);

		//Increase count of flights.
		countfly++;
		
		return p.x;
	}

	//This method returns the point that represents the position of the bird.
	public Point getPosition(){

		return p;
	}
}