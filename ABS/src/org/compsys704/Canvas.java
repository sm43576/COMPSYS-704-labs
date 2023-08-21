package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	BufferedImage conveyer1, conveyer2, conveyer3;
	BufferedImage arm2;
	BufferedImage p1;
	BufferedImage p2;
	BufferedImage loader;
	BufferedImage cap;
	
	public Canvas(){
		try {
			conveyer1 = ImageIO.read(new File("res/Conveyer1.png"));
			conveyer2 = ImageIO.read(new File("res/Conveyer2.png"));
			conveyer3 = ImageIO.read(new File("res/Conveyer3.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// ADD YOUR IMAGES AND STATE HANDLING HERE
		if(!States.BOTTLE_AT_POS1 && !States.CONVEYOR_MOVE) { // conveyor idling
			g.drawImage(conveyer1, 0, 100, null);
//			System.out.println("idle");
		}
		if (!States.CONVEYOR_MOVE && States.BOTTLE_AT_POS1  ) { // conveyor delivered
			g.drawImage(conveyer3, 0, 100, null);
//			System.out.println("delivered");
		}

		
		if(States.CONVEYOR_MOVE){ // conveyor moving
			g.drawImage(conveyer2, 0, 100, null);
//			System.out.println("moving");
		}
		

	}
}
