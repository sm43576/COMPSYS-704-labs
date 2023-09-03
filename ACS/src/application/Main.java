package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.systemj.netapi.SimpleClient;
import com.systemj.netapi.SimpleServer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

	static Controller myController;
	static Timer door1Timer = new Timer();
	static Timer door2Timer = new Timer();
	static Timer door3Timer = new Timer();
	static Timer zone1Timer = new Timer();
	static Timer zone2Timer = new Timer();
	static Timer zone3Timer = new Timer();
	static Timer zone7Timer = new Timer();
	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
    	Parent root = loader.load();
    	
    	
    	myController = (Controller) loader.getController();
        primaryStage.setTitle("Advantech ACS");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        SimpleServer s1 = new SimpleServer("127.0.0.1", 20000);
        SimpleServer s2 = new SimpleServer("127.0.0.1", 20001);
        SimpleServer s3 = new SimpleServer("127.0.0.1", 20002);
        s1.addConsumer("UI", "zone1Num", (status, value) -> updateSignalStatus(InputSignal.ZONE1NUM, status, value));
        s1.addConsumer("UI", "zone2Num", (status, value) -> updateSignalStatus(InputSignal.ZONE2NUM, status, value));
        s1.addConsumer("UI", "zone3Num", (status, value) -> updateSignalStatus(InputSignal.ZONE3NUM, status, value));
        s1.addConsumer("UI", "zone7Num", (status, value) -> updateSignalStatus(InputSignal.ZONE7NUM, status, value));
        s2.addConsumer("UI", "zone1Unauth", (status, value) -> updateSignalStatus(InputSignal.ZONE1UNAUTH, status));
        s2.addConsumer("UI", "zone2Unauth", (status, value) -> updateSignalStatus(InputSignal.ZONE2UNAUTH, status));
        s2.addConsumer("UI", "zone3Unauth", (status, value) -> updateSignalStatus(InputSignal.ZONE3UNAUTH, status));
        s2.addConsumer("UI", "zone7Unauth", (status, value) -> updateSignalStatus(InputSignal.ZONE7UNAUTH, status));
        s3.addConsumer("UI", "emergencyOffUI", (status, value) -> updateSignalStatus(InputSignal.EMERGENCYOFFUI, status));
        s3.addConsumer("UI", "door1GrantUI", (status, value) -> updateSignalStatus(InputSignal.DOOR1GRANTUI, status));
        s3.addConsumer("UI", "door1DenyUI", (status, value) -> updateSignalStatus(InputSignal.DOOR1DENYUI, status));
        
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
			switch(sig) {
				case ZONE1NUM:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
		 					myController.setZone1CountVal((Integer)sig.getValue());
		                 }
		             });
					break;
				case ZONE2NUM:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
		 					myController.setZone2CountVal((Integer)sig.getValue());
		                 }
		             });
					break;
				case ZONE3NUM:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
		 					myController.setZone3CountVal((Integer)sig.getValue());
		                 }
		             });
					break;
				case ZONE7NUM:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
		 					myController.setZone7CountVal((Integer)sig.getValue());
		                 }
		             });
					break;
				case ZONE1UNAUTH:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
	                	 myController.setZone1Status(Indicator.RED);
		 			    	//clear all other timer tasks.
		 					zone1Timer.purge();
		 					//Declare & schedule new timer task to set indicator white after 5 seconds.
		 					TimerTask zone1Task = new TimerTask(){ public void run(){ myController.setZone1Status(Indicator.GREEN);} };
		 					zone1Timer.schedule(zone1Task,5000l);
		                 }
		             });
					break;
				case ZONE2UNAUTH:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
	                	 myController.setZone2Status(Indicator.RED);
		 			    	//clear all other timer tasks.
		 					zone2Timer.purge();
		 					//Declare & schedule new timer task to set indicator white after 5 seconds.
		 					TimerTask zone2Task = new TimerTask(){ public void run(){ myController.setZone2Status(Indicator.GREEN);} };
		 					zone2Timer.schedule(zone2Task,5000l);
		                 }
		             });
					break;
				case ZONE3UNAUTH:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
	                	 myController.setZone3Status(Indicator.RED);
		 			    	//clear all other timer tasks.
		 					zone3Timer.purge();
		 					//Declare & schedule new timer task to set indicator white after 5 seconds.
		 					TimerTask zone3Task = new TimerTask(){ public void run(){ myController.setZone3Status(Indicator.GREEN);} };
		 					zone3Timer.schedule(zone3Task,5000l);
		                 }
		             });
					break;
				case ZONE7UNAUTH:
					Platform.runLater(new Runnable() {
		                 @Override public void run() {
		                	myController.setZone7Status(Indicator.RED);
		 			    	//clear all other timer tasks.
		 					zone7Timer.purge();
		 					//Declare & schedule new timer task to set indicator white after 5 seconds.
		 					TimerTask zone7Task = new TimerTask(){ public void run(){ myController.setZone7Status(Indicator.GREEN);} };
		 					zone7Timer.schedule(zone7Task,5000l);
		                 }
		             });
					break;
				case EMERGENCYOFFUI:
					myController.setABSStatus(Indicator.RED); //Emergency mode on.
					myController.setOverallStatus(false);
					break;
				case DOOR1GRANTUI:
					myController.setDoor1Status(Indicator.GREEN);
			    	//clear all other timer tasks.
					door1Timer.purge();
					//Declare & schedule new timer task to set indicator white after 5 seconds.
					TimerTask door1Task = new TimerTask(){ public void run(){ myController.setDoor1Status(Indicator.RED);} };
					door1Timer.schedule(door1Task,5000l);
					break;
				case DOOR1DENYUI:
					myController.setDoor1Status(Indicator.ORANGE);
			    	//clear all other timer tasks.
					door1Timer.purge();
					//Declare & schedule new timer task to set indicator white after 5 seconds.
					TimerTask door1Task2 = new TimerTask(){ public void run(){ myController.setDoor1Status(Indicator.RED);} };
					door1Timer.schedule(door1Task2,5000l);
					break;
				default:
	    	    //Invalid state
				System.out.println("Something is very wrong.");
			}
    	}

    }

    public static void main(String[] args) {
        launch(args);
    }

}
