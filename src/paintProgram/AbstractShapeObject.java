package paintProgram;

import java.awt.Color;

public abstract class AbstractShapeObject implements ShapeInterface
{
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	private int thickness;
	private String mode;   // Am I a Rectangle, Line, etc.
	private boolean keep;  // do I keep the shape or erase it later

    public AbstractShapeObject() 
    {
    	this(0,0,0,0,defaultThickness,defaultColor);
    }
 
    public AbstractShapeObject(int x, int y) 
    {
    	this(x,y,defaultWidth,defaultHeight,defaultThickness,defaultColor);
    }

    public AbstractShapeObject(int x, int y, Color color) 
    {
    	this(x,y,defaultWidth,defaultHeight,defaultThickness,color);
    }

    public AbstractShapeObject(int x, int y, int thickness) 
    {
    	this(x,y,defaultWidth,defaultHeight,thickness,defaultColor);
    }

    public AbstractShapeObject(int x, int y, int thickness, Color color) 
    {
    	this(x,y,defaultWidth,defaultHeight,thickness,color);
    }

    public AbstractShapeObject(int x, int y, int width, int height) 
    {
    	this(x,y,width,height,defaultThickness,defaultColor);
    }
    
    public AbstractShapeObject(int x, int y, int width, int height, Color color) 
    {
    	this(x,y,width,height,defaultThickness, color);
    }

    public AbstractShapeObject(int x, int y, int width, int height, int thickness) 
    {
    	this(x,y,width,height,thickness, defaultColor);
    }

    public AbstractShapeObject(int x, int y, int width, int height, int thickness, Color color) 
    {
    	this.x = x;
    	this.y = y;
    	this.width = width;
    	this.height = height;
    	this.color = color;
    	this.thickness = thickness;
    	mode = "None";
    	keep = true;
    }
		
	// write all of your getter and setter methods here !!!
	// do NOT write your draw methods here
	// you will write your draw methods in the specific classes
    // since you don't really know what to draw here
    
    
	public int getX()
	{
		return x; //change me
	}
	
	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y; //change me
	}
	
	public void setY(int y)
	{
		this.y = y;
	}

	public int getWidth()
	{
		return width; //change me
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height; //change me
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getThickness()
	{
		return thickness; //change me
	}
	
	public void setThickness(int thickness)
	{
		this.thickness = thickness;
	}

	public Color getColor()
	{
		return color; //change me
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}

	public String getMode()
	{
		return mode; // change me	
	}
	
	public void setMode(String mode)
	{
		this.mode = mode;
	}
	
	public boolean getKeep()
	{
		return keep; // change me
	}
	
	public void setKeep(boolean keep)
	{
		this.keep = keep;
	}



	// do NOT change this method
	public void calcXYWidthHeight(int x1, int y1, int x2, int y2)
	{
		int width = Math.abs(x2-x1);
		int height = Math.abs(y2-y1);
		
		// now I need to find my upper left corner point
		
		// find the x1 value
		if (x2 <= x1)
		{ 
			x1 = x2;					
		}			

		// find the y1 value
		if (y2 <= y1)  // they have dragged the mouse up
		{
			y1 = y2;
		}
		
		// now set the instance variables of the class
		setX(x1);
		setY(y1);
		setWidth(width);
		setHeight(height);
	}

}