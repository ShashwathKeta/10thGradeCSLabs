package paintProgram;
import java.awt.*;

public class Ellipse extends AbstractShapeObject {

    public Ellipse(int x, int y, int width, int height) {
    	super(x,y,width,height);
    }
    
    public Ellipse(int x, int y, int width, int height, Color color) {
    	super(x,y,width,height,color);
    	
    }

    public Ellipse(int x, int y, int width, int height, int thickness) {
    	super(x,y,width,height,thickness);
    	
    }

    public Ellipse(int x, int y, int width, int height, int thickness, Color color) {
    	super(x,y,width,height,thickness,color);
    	
    }

	public void draw(Graphics window)
	{
	
		window.setColor(getColor());
		window.drawArc(getX(), getY(), getWidth(), getHeight(), 0, 360);
	}
	
	// write the toString() method
	// use the same format that is used for the Rectangle and Line classes
}

