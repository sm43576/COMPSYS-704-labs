package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	BufferedImage arm1;
	BufferedImage arm2;
	BufferedImage p1;
	BufferedImage p2;
	BufferedImage loader;
	BufferedImage cap;
	
	public Canvas(){
		try {
			BufferedImage bi = ImageIO.read(new File("res/arm.png"));
			arm1 = bi.getSubimage(0, 0, 64, 256);
			arm2 = bi.getSubimage(71, 0, 48, 256);
			loader = ImageIO.read(new File("res/loader.png"));
			bi = ImageIO.read(new File("res/pusher.png"));
			p1 = bi.getSubimage(0, 0, 238, 68);
			p2 = bi.getSubimage(238, 0, 172, 68);
			cap = ImageIO.read(new File("res/cap.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(loader, 0, 100, null);
		
		if(States.ARM_AT_DEST)
			g.drawImage(arm1, 0, 0, null);
		else
			g.drawImage(arm2, 30, 0, null);
		
		if(States.GRIPPED){
			if(States.ARM_AT_DEST){
				g.setColor(Color.black);
				g.fillOval(10, 11, 30, 30);
				g.setColor(Color.red);
				g.fillOval(10, 11, 15, 15);

			}
			else{
				g.setColor(Color.black);
				g.fillOval(40, 243, 30, 30);
				g.setColor(Color.red);
				g.fillOval(35, 232, 15, 15);
			}
			g.setColor(Color.black);
		}
//		else{
			if(States.CAP_READY){ // A cap is pushed to the source pos
				g.setColor(Color.black);
				g.fillOval(40, 243, 30, 30);
			}
//		}
		
		if(States.PUSHER_RETRACTED){
			g.drawImage(p1, 90, 225, null);
			if(!States.MAG_EMPTY){
				g.setColor(Color.black);
				g.fillOval(154, 243, 30, 30);
			}
		}
		else{
			g.drawImage(p2, 90, 225, null);
		}
		
		if(!States.MAG_EMPTY){
			g.drawImage(cap, 152, 155, null);
		}
	}
}
