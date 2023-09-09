package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.systemj.netapi.SimpleClient;
import com.systemj.netapi.SimpleServer;

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
        primaryStage.setScene(new Scene(root,850,520));
        primaryStage.show();
        

        SimpleServer humanIndicator = new SimpleServer("127.0.0.1", 20010);
        System.out.println("Server 1 okay");
        SimpleServer tempIndicator = new SimpleServer("127.0.0.1", 20011);
        System.out.println("Server 2 okay");
        SimpleServer humidIndicator = new SimpleServer("127.0.0.1", 20012);
        System.out.println("Server 3 okay");
        
        
        // adds light
        //zone1circle
//        humanIndicator.addConsumer("ecsUI", "zone1Light", (status, value) -> updateLight("zone1circle",controller,status, value));
//        humanIndicator.addConsumer("ecsUI", "zone2Light", (status, value) -> updateLight("zone2circle",controller, value));
        humanIndicator.addConsumer("ecsUI", "zone3Light", (status, value) -> updateLight("zone3circle",controller,status,value));
//        
//        tempIndicator.addConsumer("ecsUI", "zone3Light", (status, value) -> updateLight("zone1circle", status));
//        humidIndicator.addConsumer("ecsUI", "zone3Light", (status, value) -> updateLight(zone3circle.EMERGENCYOFFUI, status));

//        //Tests
        //controller.setZoneCircle("zone1circle",1);
//        controller.setHumidity("humid3", 20);
//        controller.setTemp("temp1",24);
       
        //scene.getStyleSheets().add(getClass().getResource("application.css"));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void updateLight(String zone,ecsUI controller,Boolean Status,Object value) { 
    	//System.out.println("this is" + Status.toString() + value.toString());

    	String booleanString = Status ? "true" : "false";
    	System.out.println(booleanString);
    	if (true) {
    		System.out.println("on");
    		controller.setZoneCircle(zone,0); // 0 means red
    		
    	}else {
    		System.out.println("off");
    		controller.setZoneCircle(zone,1); //1 means green
    	}
    }
    
//    
//    public static void updateTemp(String zone,ecsUI controller,Boolean status) {   	
//    	
//    }
//    public static void updateHumid(String zone,ecsUI controller,Boolean status) {   	
//    }
    
    
    
    
}