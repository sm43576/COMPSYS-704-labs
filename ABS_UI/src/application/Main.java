package application;

import com.systemj.netapi.SimpleServer;

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
        
        SimpleServer s1 = new SimpleServer("127.0.0.1", 15565);
        System.out.println("Server 1 okay");
     
        //UI functions are in controller
        s1.addConsumer("ABS-UI", "conveyorStatusUIE", (status, value) -> updateStatus(status,value,"conveyor",myController));
        s1.addConsumer("ABS-UI", "fillerStatusUIE", (status, value) -> updateStatus(status,value,"filler",myController));
        s1.addConsumer("ABS-UI", "capperStatusUIE", (status, value) -> updateStatus(status,value,"capper",myController));
        s1.addConsumer("ABS-UI", "capLoaderStatusUIE", (status, value) -> updateStatus(status,value,"caploader",myController));
        myController.setBottle1Visibility(false);    
;
    }
    
    public static void updateStatus(Boolean status, Object value, String caseX,Controller controller) {
    	
    	if(value!=null) {
	    	switch(caseX){
	    		case "conveyor":
	    			if((Boolean)value) {
		    			controller.setLArrowStatus(Indicator.GREEN);
		    			controller.setRArrowStatus(Indicator.GREEN);
	    			}else {
		    			controller.setLArrowStatus(Indicator.RED);
		    			controller.setRArrowStatus(Indicator.RED);
	    			}
	    			break;
	    		case "filler":
	    			if((Boolean)value) {
	    				controller.setFillerStatus(Indicator.GREEN);
	    			}else {
	    				controller.setFillerStatus(Indicator.RED);
	    			}
	    			break;
	    			
	    		case "capper":
	    			if((Boolean)value) {
	    				controller.setCapperStatus(Indicator.GREEN);
	    				System.out.println("Capper on");
	    			}else {
	    				controller.setCapperStatus(Indicator.RED);
	    				System.out.println("Capper Off");
	    			}
	    			break;
	    			
	    		case "caploader":
	    			if((Boolean)value) {
	    				controller.setCapLoaderStatus(Indicator.GREEN);
	    			}else {
	    				controller.setCapLoaderStatus(Indicator.RED);
	    			}
	    			break;
	    		
	    			
	    			
	    		default:
	    			System.out.println("");
    		}
    	}
    	
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
