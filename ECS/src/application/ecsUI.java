package application;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ecsUI extends Main {
	
	@FXML 
	private Circle zone1circle, zone2circle, zone3circle, zone4circle, zone5circle, zone6circle,zone7circle;
	@FXML
	private Label temp1,temp2,temp3,temp4,temp5,temp6,temp7;
	@FXML
	private ProgressIndicator humid1,humid2,humid3,humid4,humid5,humid6,humid7;


	private Circle[] circleArray;
	private Label[] tempArray;
	private ProgressIndicator[] humidArray;
	
	 @FXML
	    public void initialize() {
		 System.out.println("ECSUIController initialized.");
		 this.circleArray = new Circle[]{zone1circle, zone2circle, zone3circle, zone4circle, zone5circle, zone6circle,zone7circle};
		 this.tempArray = new Label[]{temp1,temp2,temp3,temp4,temp5,temp6,temp7};
		 this.humidArray = new ProgressIndicator[]{humid1,humid2,humid3,humid4,humid5,humid6,humid7};
		
	    }
	 

	 public void setZoneCircle(String zoneCircle,int val) {			
		for (Circle circle : this.circleArray) {
	        if (circle.getId().equals(zoneCircle)) {
	            // Update the circle properties as needed
	        	System.out.println("match");
	            if (val == 1) {
	                circle.setFill(Color.RED);
	            } else if(val == 0){
	                circle.setFill(Color.LIGHTGREEN);
	            }
	             break; // Break out of the loop once the circle is found and updated
	        }
		}
	}
	 
	public void setTemp(String zone,int val) {
			
		for (Label tempLabel : this.tempArray) {
			System.out.println(tempLabel);
	        if (tempLabel.getId().equals(zone)) {
	            // Update the circle properties as needed
	        	System.out.println("match");
	        	String text = Integer.toString(val) + "C";
	            tempLabel.setText(text);
	            break; // Break out of the loop once the circle is found and updated
	        }
		}
	}
	
	public void setHumidity(String zone,int val) {
	
		for (ProgressIndicator humidLabel : this.humidArray) {
	        if (humidLabel.getId().equals(zone)) {
	            // Update the circle properties as needed
	        	double value = (double)val/100 ;
	        	
	            humidLabel.setProgress(value);
	            break; // Break out of the loop once the circle is found and updated
	        }
		}
		
	}
		
	


}
