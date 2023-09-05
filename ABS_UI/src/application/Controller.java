package application;

import java.io.File;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Controller {
	
	private int wheelAngle = 0;
	
    @FXML
	private ImageView wheel;
    
//    @FXML
//	public void initialize() {
//    	
//    	rotate();
//    }
    
    public void showAbout() {
    	
	   	Alert alert = new Alert(AlertType.NONE, "Advantech Automated Bottling System"
	   			+ "\n\nCOMPSYS704 Advanced Embedded Systems - SystemJ"
	  			+ "\n@ The University of Auckland 2023"
	   			+ "\n\nRachel Nataatmadja, Shou Miyamoto, Anthony Mulder.", ButtonType.OK);
	   	alert.showAndWait();
    }
    
    public void rotate() {
    	
    	
    	RotateTransition rotate = new RotateTransition();
    	rotate.setNode(wheel);
    	rotate.setDuration(Duration.millis(1000));
    	//rotate.setCycleCount(TranslateTransition.INDEFINITE);
    	wheel.setRotate(wheelAngle);
    	rotate.setByAngle(60);
    	System.out.println(wheelAngle + " " + (wheelAngle+60));
    	if (wheelAngle >= 300) {
    		wheelAngle = 0;
    	} else {
        	wheelAngle = wheelAngle + 60;
    	}
    	rotate.playFromStart();
    }
    
    
}

