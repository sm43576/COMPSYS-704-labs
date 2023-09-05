package application;

import java.io.File;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Controller {
	
	private int carouselAngle = 0;
	
    @FXML
	private ImageView carousel;
    @FXML
    private Circle fillerStatus, capLStatus, conveyorStatus, carouselStatus;
    @FXML
    private Label lblFillerStatus, lblCapLStatus, lblConveyorStatus, lblCarouselStatus;
    @FXML
    private Button btnEnable;
    @FXML
    private ImageView lArrow, rArrow;
    
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
    	rotate.setNode(carousel);
    	rotate.setDuration(Duration.millis(1000));
    	//rotate.setCycleCount(TranslateTransition.INDEFINITE);
    	carousel.setRotate(carouselAngle);
    	rotate.setByAngle(60);
    	System.out.println(carouselAngle + " " + (carouselAngle+60));
    	if (carouselAngle >= 300) {
    		carouselAngle = 0;
    	} else {
        	carouselAngle = carouselAngle + 60;
    	}
    	rotate.playFromStart();
    }
    
    
}

