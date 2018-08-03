package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block{

	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y);
		// now set your xSpeed and ySpeed
		this.xSpeed = 3;
		// do ySpeed right here
		
	}

	public Ball(int x, int y, int width, int height)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height);
		// now set your xSpeed and ySpeed
		this.xSpeed = 3;
		// do ySpeed right here
		
	}

	public Ball(int x, int y, int width, int height, Color color)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height,color);
		// now set your xSpeed and ySpeed
		this.xSpeed = 3;
		// do ySpeed right here
		
	}

	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height,color);
		// now set your xSpeed and ySpeed
		this.xSpeed = xSpeed;
		// do ySpeed right here
		
	}
	
	
   // DO NOT REWRITE getX(), setX(), etc. 
   // you did those in the Block class and you inherited them
   	   
   // write the set methods for setXSpeed and setYSpeed
   // write the get methods for getXSpeed and getYSpeed
   
   // we will override the draw method in the Block class
   public void draw(Graphics window)
   {
      window.setColor(getColor());
      // change me so that I draw a round ball
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   // we will override the draw method in the Block class
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      // change me so that I draw a round ball
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void moveAndDraw(Graphics window)
   {
   	  // draw a white ball at old ball location
   	  // so that we erase the current ball
	  draw(window,Color.WHITE);

      // change your x and y variables
      setX(getX()+xSpeed);
	  // now call setY to change your y value

	  // draw the ball at its new location
	  // by calling the draw method
	  // do not pass it a color, let the draw method use the Block color
	  // draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		// 2 ball objects are considered equal if their attributes (properties,
		// instance variables are the same
		// if (getX()=other.getX() && etc.


		return false;
	}   


   //add a toString() method and return your super.toString() and xSpeed and ySpeed
   // remember that toString() methods should return the values of your instance variables
   

}
