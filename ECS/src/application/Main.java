package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.systemj.netapi.SimpleClient;
import com.systemj.netapi.SimpleServer;

public class Main extends Application{
	static ecsUI controller;

    
	public static void main(String[] args){
    	launch(args);
    }

    
    public void start(Stage primaryStage){
    	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("./ECS.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        
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
        humanIndicator.addConsumer("ecsUI", "zone1Light", (status, value) -> updateLight(status,value,"zone1circle",controller));
        humanIndicator.addConsumer("ecsUI", "zone3Light", (status,value) -> updateLight(status,value,"zone3circle",controller));
//        
        tempIndicator.addConsumer("ecsUI", "zone1Temp", (status, value) -> updateTemp(status,value,"temp1",controller));
        humidIndicator.addConsumer("ecsUI", "zone4Humid", (status, value) -> updateHumid(status,value,"humid4",controller));

//        //Tests
        //controller.setZoneCircle("zone1circle",1);
        //controller.setHumidity("humid3", 20);
//        controller.setTemp("temp1",24);
       
        //scene.getStyleSheets().add(getClass().getResource("application.css"));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void updateLight(Boolean Status,Object value,String zone,ecsUI controller) { 

    	if(value!= null) {
	    	String text = (String) value;
	    	if (text.equals("detected")) {
	    		System.out.println("on");
	    		controller.setZoneCircle(zone,0); // 0 means red
		  	}else if(text.equals("notdetected")) {
	   			System.out.println("off");
	    		controller.setZoneCircle(zone,1); //1 means green
		   	}
	    //	sendReceivedStatusSignal();
	    	System.out.println("end");
    	}
    }
    
//    
    public static void updateTemp(Boolean Status,Object value,String zone,ecsUI controller) { 	
    	if(value!= null) {
    		System.out.println("Set Temperature");
    		int text = (int) value;
    		controller.setTemp(zone,text);
    	}
    }
    public static void updateHumid(Boolean Status,Object value,String zone,ecsUI controller) {   	
    	if(value!= null) {
    		System.out.println("Set Humidity");
    		int text = (int) value;
    		controller.setHumidity(zone,text);
    	}
    }
    

    
    
    
}