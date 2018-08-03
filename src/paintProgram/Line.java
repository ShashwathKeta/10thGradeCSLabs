package paintProgram;
import java.awt.*;

public class Line extends AbstractShapeObject 
{
	private int x2;
	private int y2;
	
    public Line(int x1, int y1, int x2, int y2) {
    	super(x1,y1);
    	this.x2 = x2;
    	this.y2 = y2;
    }
    
    public Line(int x1, int y1, int x2, int y2, Color color) {
    	super(x1,y1,color);
    	this.x2 = x2;
    	this.y2 = y2;
    }

    public Line(int x1, int y1, int x2, int y2, int thickness) {
    	// call super first passing on x1,y1, and thickness
    	// then set your own x2 and y2 values
    	super(x1,y1,thickness);
    	this.x2 = x2;
    	this.y2 = y2;
    }

    public Line(int x1, int y1, int x2, int y2, int thickness, Color color) {
    	super(x1,y1,thickness,color);
    	this.x2 = x2;
    	this.y2 = y2;
   }

	
	public int getX1()
	{
		return getX();
	}
	
	public void setX1(int x)
	{
		setX(x);
	}

	public int getY1()
	{
		return getY();
	}
	
	public void setY1(int y)
	{
		setY(y);
	}

	public int getX2()
	{
		return x2;  // change me
	}
	
	public void setX2(int x2)
	{
		this.x2 = x2;
	}

	public int getY2()
	{
		return y2; // change me
	}
	
	public void setY2(int y2)
	{
		this.y2 = y2;
	}

	// notice that the reference (pointer) to
	// the graphics libary is called window
	public void draw(Graphics window)
	{
		// first, set your draw color
		// window.????(????);
		window.setColor(getColor());
		window.drawLine(getX1(), getY1(), getX2(), getY2());
		// second, draw the shape (i.e. draw the line)
		// window.????(???????????);
	}
	
 	// each toString() method must use this format
    public String toString()
    {
    	return getMode() + "," + getX1() + "," + getY1() + "," + getX2() + "," + getY2() + "," 
    	            + getColor().getRed() + "," + getColor().getGreen() + "," + getColor().getBlue();    	          
    }
    
}