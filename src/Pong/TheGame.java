package Pong;

import javax.swing.JFrame;

public class TheGame extends JFrame{

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);
		
		
		
		// DO NOT REMOVE THIS LINE OF CODE
		System.out.println("2018 version.");

		System.out.println("My name is xxxxx xxxxx");
	}
	
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}

}
