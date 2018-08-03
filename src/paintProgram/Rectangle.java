package paintProgram;
import java.awt.*;

public class Rectangle extends AbstractShapeObject {
	
    public Rectangle() {
    	super();
    }

    public Rectangle(int x, int y, int width, int height) {
    	super(x,y,width,height);
    }
    
    public Rectangle(int x, int y, int width, int height, Color color) {
    	super(x,y,width,height,color);

    }

    public Rectangle(int x, int y, int width, int height, int thickness) {
    	super(x,y,width,height,thickness);
    }

    public Rectangle(int x, int y, int width, int height, int thickness, Color color) {
    	super(x,y,width,height,thickness,color);
    }

	public void draw(Graphics window)
	{
		// first, set your draw color
		// window.????(?????);
		window.setColor(getColor());
		window.drawRect(getX(), getY(), getWidth(), getHeight());
		// second, draw the shape (i.e. draw the rectangle)
		// window.????(?????);
	}
	
			
	// each toString() method must use this format
    public String toString()
    {
    	return getMode() + "," + getX() + "," + getY() + "," + getWidth() + "," + getHeight() + "," 
    	            + getColor().getRed() + "," + getColor().getGreen() + "," + getColor().getBlue();    	          
    }
   
}