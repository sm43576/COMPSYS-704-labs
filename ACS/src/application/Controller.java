package application;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle door1Status, door2Status, door3Status, absStatus;
    @FXML
    private Label overallStatus;
    @FXML
    private ImageView zone1Status, zone2Status, zone3Status, zone7Status;
    @FXML
    private Label zone1Count, zone2Count, zone3Count, zone7Count;
    
    @FXML
    public void showAbout() {
    	
    	Alert alert = new Alert(AlertType.NONE, "Advantech Access & Safety Control System"
    			+ "\n\nCOMPSYS704 Advanced Embedded Systems - SystemJ"
    			+ "\n@ The University of Auckland"
    			+ "\n\nWritten by Anthony Mulder 2023", ButtonType.OK);
    	alert.showAndWait();
    	
    }
    
    public void setZone1CountVal(int val) {
    	zone1Count.setText(Integer.toString(val));
    }
    
    public void setZone2CountVal(int val) {
    	zone2Count.setText(Integer.toString(val));
    }
    
    public void setZone3CountVal(int val) {
    	zone3Count.setText(Integer.toString(val));
    }
    
    public void setZone7CountVal(int val) {
    	zone7Count.setText(Integer.toString(val));
    }
    
    public void setZone1Status(Indicator c) {
    
    	Image newImg;
    	
    	switch(c) {
    	  case GREEN:
    		newImg = new Image("file:../../img/employee-green.png");
        	zone1Status.setImage(newImg);
    	    break;
    	  case RED:
      		newImg = new Image("file:../../img/employee-red.png");
        	zone1Status.setImage(newImg);
    	    break;
    	  default:
    	    // code block
    	}
    }
    
    public void setZone2Status(Indicator c) {
    	Image newImg;
    	switch(c) {
    	  case GREEN:
    		newImg = new Image("file:../../img/employee-green.png");
        	zone2Status.setImage(newImg);
    	    break;
    	  case RED:
      		newImg = new Image("file:../../img/employee-red.png");
        	zone2Status.setImage(newImg);
    	    break;
    	  default:
    	    // code block
    	}
    }
    
    public void setZone3Status(Indicator c) {
    	Image newImg;
    	switch(c) {
    	  case GREEN:
    		newImg = new Image("file:../../img/employee-green.png");
        	zone3Status.setImage(newImg);
    	    break;
    	  case RED:
      		newImg = new Image("file:../../img/employee-red.png");
        	zone3Status.setImage(newImg);
    	    break;
    	  default:
    	    // code block
    	}
    }
    public void setZone7Status(Indicator c) {
    	Image newImg;
    	switch(c) {
    	  case GREEN:
    		newImg = new Image("file:../../img/employee-green.png");
        	zone7Status.setImage(newImg);
    	    break;
    	  case RED:
      		newImg = new Image("file:../../img/employee-red.png");
        	zone7Status.setImage(newImg);
    	    break;
    	  default:
    	    // code block
    	}
    }
    public void setDoor1Status(Indicator c) {
    	door1Status.setFill(javafx.scene.paint.Color.web(c.getColourCode()));
    }
    public void setDoor2Status(Indicator c) {
    	door2Status.setFill(javafx.scene.paint.Color.web(c.getColourCode()));
    }
    public void setDoor3Status(Indicator c) {
    	door3Status.setFill(javafx.scene.paint.Color.web(c.getColourCode()));
    }
    public void setABSStatus(Indicator c) {
    	absStatus.setFill(javafx.scene.paint.Color.web(c.getColourCode()));
    }
    public void setOverallStatus(boolean status) {
    	if (status == true) {
    		overallStatus.setText("Systems Nominal");
    	} else {
    		overallStatus.setText("Emergency\nshutdown");
    	}
    }
    
    
}

