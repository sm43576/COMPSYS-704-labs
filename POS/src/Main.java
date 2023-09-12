
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import com.systemj.netapi.SimpleClient;
import com.systemj.netapi.SimpleServer;



public class Main extends Application {
	static HomeController myController;

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("POS_home.fxml"));
    	Parent root = loader.load();
    	
        myController = (HomeController) loader.getController();
        primaryStage.setResizable(false);
        primaryStage.setTitle("POS");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
        
        SimpleServer s1 = new SimpleServer("127.0.0.1", 40001);
        s1.addConsumer("UI", "orderStatus", (status,value) -> updateOrder(status,value, myController));
    }
    
    public static void updateOrder(Boolean status, Object value, HomeController controller) {
    	Order order = (Order)value;
    	Customer customer = controller.findCustomer(order.getCustomerID());
    	System.out.println("WOOOOO WE GOT STATUS BACK");
    	controller.updateOrderStatusInList(customer, order);
    	Platform.runLater(() -> {
    		 controller.updateOrderHistoryTable();
    	});
    	
    	sendReceivedStatusSignal();
    	
    }
    
    public static void sendReceivedStatusSignal() {
    	try {
			SimpleClient s2 = new SimpleClient("127.0.0.1", 40000, "OrchestratorCD", "recOrderStatus");
//    		s2.sustain(); // Emitting an order for 1 seconds
			s2.emit(true, 10);
    		System.out.println("emitted received order status to orch");
//    		s2.close(); // close when necessary
    		
		}catch (IOException e) {
			e.printStackTrace();
		}
    }
 

    public static void main(String[] args) {
        launch(args);
    }
}
