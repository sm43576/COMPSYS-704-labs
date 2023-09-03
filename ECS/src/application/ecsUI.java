package application;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ecsUI extends Main {
	
	@FXML 
	private Circle zone1circle, zone2circle, zone3circle, zone4circle, zone5circle, zone6circle,zone7circle;

	private Circle[] circleArray;
	
	 @FXML
	    public void initialize() {
		 System.out.println("ECSUIController initialized.");
		 this.circleArray = new Circle[]{zone1circle, zone2circle, zone3circle, zone4circle, zone5circle, zone6circle,zone7circle};
		
	    }
	 

	public void setZoneCircle(String zoneCircle,int val) {
			
		for (Circle circle : this.circleArray) {
	        if (circle.getId().equals(zoneCircle)) {
	            // Update the circle properties as needed
	        	System.out.println("match");
	            if (val == 1) {
	                circle.setFill(Color.RED);
	            } else {
	                circle.setFill(Color.LIGHTGREEN);
	            }
	            break; // Break out of the loop once the circle is found and updated
	        }
		}
	}
		
	


}
