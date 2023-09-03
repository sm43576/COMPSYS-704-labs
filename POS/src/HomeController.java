import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableCell;

public class HomeController {
	@FXML
    private TextField customer_ID_input;
	@FXML
    private Button new_order_btn;
	@FXML
    private Label order_hist_title;
	@FXML
    private TableView<Order> history_table;
	@FXML
    private TableColumn<Order,Integer> order_num_col, quantity_col;
	@FXML
	private TableColumn<Order,String> liquid_spec_col,status_col;
	
	private Customer customer = new Customer();
	private int nextOrderNum;
    
    @FXML
    public void initialize() {
        order_hist_title.setText("Order History");
        new_order_btn.setDisable(true);
        checkCurrentOrderNumber();
        
        order_num_col.setCellValueFactory(new PropertyValueFactory<Order,Integer>("orderNum"));
        quantity_col.setCellValueFactory(new PropertyValueFactory<Order, Integer>("quantity"));
        liquid_spec_col.setCellValueFactory(new PropertyValueFactory<Order,String>("liquidSpecDisplay"));
        status_col.setCellValueFactory(new PropertyValueFactory<Order,String>("orderStatus"));
        
     // Set a custom cell factory for the "Liquid Spec" column
        liquid_spec_col.setCellFactory(column -> {
            return new TableCell<Order, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                        setGraphic(null);
                        System.out.println("its empty");
                    } else {
                        setText(null); // Clear the text
                        Label label = new Label(item);
                        label.setWrapText(true);
                        setGraphic(label);
                        System.out.println("its not empty");
                    }
                }
            };
        });

        
        System.out.println("Initialised home");
    }
    
    // Checks for the new order number depending on the size of the order list a customer has
    public void checkCurrentOrderNumber() {
    	if((this.customer.getCustomerID()!= null) && (!this.customer.getOrdersList().isEmpty())) {
    		List<Order> orders = this.customer.getOrdersList();
    		int size = this.customer.getOrdersList().size();
    		this.nextOrderNum = size+1;
    	} else {
    		this.nextOrderNum = 1;
    	}
    }
    
    
    @FXML
    void showOrderHistoryForCustomerTitle(KeyEvent event) { // changes the title of the order_hist_title label to the customer's ID
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
    void openNewOrderWindow(MouseEvent event) throws IOException { // opens the new order window
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("POS_new_order.fxml"));
        Parent root = loader.load();
        NewOrderController newOrderController = loader.getController();
        newOrderController.setCustomer(customer);
        checkCurrentOrderNumber();
        newOrderController.setOrderNumber(this.nextOrderNum);
        newOrderController.setHomeController(this);
        
        
    	Stage secondaryStage = new Stage();
    	secondaryStage.setTitle("New Order");
    	secondaryStage.setScene(new Scene(root, 640, 600));
    	secondaryStage.show();
    	
    }
    
    public void updateOrderHistoryTable() {
    	ObservableList<Order> observableOrderList = FXCollections.observableArrayList(this.customer.getOrdersList());
    	System.out.println(this.customer.getOrdersList().get(0).getLiquidSpecDisplay());
    	history_table.setItems(observableOrderList);
    }

    
}