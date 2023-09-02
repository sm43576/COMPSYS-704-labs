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
        Parent root = FXMLLoader.load(getClass().getResource("./ECS.fxml"));
        primaryStage.setTitle("ECS Window");
        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.show();
        //scene.getStyleSheets().add(getClass().getResource("application.css"));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}