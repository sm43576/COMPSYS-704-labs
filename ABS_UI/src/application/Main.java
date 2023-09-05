package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

	static Controller myController;
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
    	Parent root = loader.load();
    	
    	
    	myController = (Controller) loader.getController();
        primaryStage.setTitle("Advantech ABS");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        
    }
    
  
    
    public static void updateSignalStatus(InputSignal sig, Boolean status, Object value) {
    	sig.setStatus(status);
    	sig.setValue(value);
    	//Maybe find a better way to do this later (Using observers/event listeners?)
    	onUpdate(sig);
    	
    }
    
    public static void updateSignalStatus(InputSignal sig, Boolean status) {
    	sig.setStatus(status);
    	onUpdate(sig);
    }
    public static void onUpdate(InputSignal sig) {
    	if (sig.getStatus() == true) {
			//do stuff
    	}

    }

    public static void main(String[] args) {
        launch(args);
    }

}
