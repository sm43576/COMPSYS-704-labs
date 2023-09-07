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
	
	
	private boolean carouselAnimPlaying = false;
	private int carouselAngle = 0;
	
    @FXML
	private ImageView carousel;
    @FXML
    private Circle fillerStatus, capLStatus, conveyorStatus, carouselStatus;
    @FXML
    private Circle bot1, bot2, bot3, bot4, bot5;
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
    
    public void setBottle1Visibility(boolean status) {
    	bot1.setVisible(status);
    }
    public void setBottle2Visibility(boolean status) {
    	bot2.setVisible(status);
    }
	public void setBottle3Visibility(boolean status) {
    	bot3.setVisible(status);
	}
	public void setBottle4Visibility(boolean status) {
    	bot4.setVisible(status);
	}
	public void setBottle5Visibility(boolean status) {
    	bot5.setVisible(status);
	}
	
    
    public void carouselAnimation() {
    	
    	//If animation is not currently playing
    	if (!carouselAnimPlaying) {
    		carouselAnimPlaying = true;
    		//Store current status of all bottles before hiding all bottles
        	boolean[] botStatus = {bot1.isVisible(), bot2.isVisible(), bot3.isVisible(), bot4.isVisible(), bot5.isVisible()};
        	
        	//Hide all bottles
        	bot1.setVisible(false);
    		bot2.setVisible(false);
    		bot3.setVisible(false);
    		bot4.setVisible(false);
    		bot5.setVisible(false);
        	
        	
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
        	
        	rotate.setOnFinished((finish) -> {
        		bot1.setVisible(botStatus[0]);
        		bot2.setVisible(botStatus[1]);
        		bot3.setVisible(botStatus[2]);
        		bot4.setVisible(botStatus[3]);
        		bot5.setVisible(botStatus[4]);
        		carouselAnimPlaying = false;
        	});
    	}
    	
    }
    
    
}

