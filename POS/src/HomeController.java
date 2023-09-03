import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class HomeController {
	@FXML
    private TextField customer_ID_input;
	@FXML
    private Button new_order_btn;
	@FXML
    private Label order_hist_title;
	@FXML
    private TableView history_table;
	@FXML
    private TableColumn order_num_col, quantity_col, liq_spec_col,status_col;
	
	private Customer customer = new Customer();
	private int currentOrderNum;
    
    @FXML
    public void initialize() {
        order_hist_title.setText("Order History");
        new_order_btn.setDisable(true);
        checkCurrentOrderNumber();
        
        System.out.println("Initialised home");
    }
    
    public void checkCurrentOrderNumber() {
    	if((this.customer.getCustomerID()!= null) && (!this.customer.getOrdersList().isEmpty())) {
    		List<Order> orders = this.customer.getOrdersList();
    		int size = this.customer.getOrdersList().size();
    		this.currentOrderNum = size;
    	} else {
    		this.currentOrderNum = 1;
    	}
    }
    
    
    @FXML
    void showOrderHistoryForCustomerTitle(KeyEvent event) {
    	if (event.getCode() == KeyCode.ENTER) {
    		String id = customer_ID_input.getText();
	    	System.out.println(id);
	    	Customer newCustomer = new Customer();
	    	newCustomer.setCustomerID(id);
	    	this.customer = newCustomer;
	    	order_hist_title.setText("Order History for "+this.customer.getCustomerID());
	    	new_order_btn.setDisable(false);
    	}
    }
    
    
    @FXML
    void openNewOrderWindow(MouseEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("POS_new_order.fxml"));
        Parent root = loader.load();
        NewOrderController newOrderController = loader.getController();
        newOrderController.setCustomer(customer);
        checkCurrentOrderNumber();
        newOrderController.setOrderNumber(this.currentOrderNum);
        
        
    	Stage secondaryStage = new Stage();
    	secondaryStage.setTitle("New Order");
    	secondaryStage.setScene(new Scene(root, 640, 600));
    	secondaryStage.show();
    	
    }

    
}