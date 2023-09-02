
import javafx.application.Application.*;


public class Main{

    public static void main(String[] args){
        try{
            Parent root = FXMLLoader.Load(getClass().getResource("/ECS.fxml"));
            Scene scene = new Scene(root,400,400);
            scene.getStyleSheets().add(getClass().getResource("application.css"));
        }   catch(Exception e){
            e.printStackTrace();
        }
    }

}