package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

    public static void main(String[] args){
    	launch(args);
    }

    
    public void start(Stage primaryStage){
    	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("./ECS.fxml"));
        Parent root = loader.load();
        ecsUI controller = loader.getController();
        
        primaryStage.setTitle("ECS Window");
        primaryStage.setScene(new Scene(root,520,350));
        primaryStage.show();
        
        controller.setZoneCircle("zone1circle",0);
       
        //scene.getStyleSheets().add(getClass().getResource("application.css"));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}