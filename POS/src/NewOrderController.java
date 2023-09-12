import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import com.systemj.netapi.SimpleClient;

public class NewOrderController {

    @FXML
    private Label order_num_title,customer_ID_title, label_total_percent;

    @FXML
    private CheckBox liq1_checkbox, liq2_checkbox, liq3_checkbox,liq4_checkbox;

    @FXML
    private TextField liq1_quant, liq2_quant, liq3_quant, liq4_quant, quantity_input;
    
    @FXML
    private Button cancel_btn, submit_btn;

    
    private Customer customer;
    private int orderNumber;
    private Boolean boxHasBeenChecked = false;
    private Boolean totalIsCorrect = false;
    private int total = 0;
    private int quantity = 0;
    private ArrayList<Integer> liquidPercent =  new ArrayList<>();
    private HomeController homeController;
    
    @FXML
    public void initialize() {
    	// Maps out default liquid percentages
    	for(int i=0; i< 4; i++) {
    		liquidPercent.add(0);
    	}
		addNumericInputFilter(liq1_quant);
		addNumericInputFilter(liq2_quant);
		addNumericInputFilter(liq3_quant);
		addNumericInputFilter(liq4_quant);
		addNumericInputFilter(quantity_input);
		 
		updateSubmitButton();
		// listener to validate the total and update the label and check if checkboxes have been used
		setupCheckBoxListeners();
		// Add Enter key handler to each quantity text field
		addTotalEnterKeyHandler(liq1_quant);
		addTotalEnterKeyHandler(liq2_quant);
		addTotalEnterKeyHandler(liq3_quant);
		addTotalEnterKeyHandler(liq4_quant);
		addQuantityEnterKeyHandler(quantity_input);
		System.out.println("Initialised new order");
    }

    // Receiving customer instance from Home page
    public void setCustomer(Customer customer) {
        this.customer = customer;
        if (customer != null) {
            String customerId = this.customer.getCustomerID();
            customer_ID_title.setText("Customer ID: " + customerId);
        }
    }
    
    // Receiving order number from Home page
    public void setOrderNumber(int orderNumber) {
    	this.orderNumber = orderNumber;
    	order_num_title.setText("Order No. " + String.valueOf(orderNumber));
    }
    
    public void updateSubmitButton() {
    	submit_btn.setDisable(!this.boxHasBeenChecked || !this.totalIsCorrect || this.quantity_input.getText().isEmpty() || this.quantity ==0);
    }
    
    // to get instance of HomeController
    public void setHomeController(HomeController homeController) {
        this.homeController = homeController;
    }
    
    // Numerical filter for text inputs and limiting them from 1 to 100
    private void addNumericInputFilter(TextField textField) {
        textField.addEventFilter(KeyEvent.KEY_TYPED, event -> {
            String input = event.getCharacter();
            if (!isValidNumericInput(input) || !isValidRange(textField.getText() + input)) {
                event.consume(); 
            }
        });
    }

    private boolean isValidNumericInput(String input) {
        return input.matches("[0-9]");
    }
    
    private boolean isValidRange(String input) {
        try {
            int value = Integer.parseInt(input);
            return value >= 1 && value <= 100;
        } catch (NumberFormatException e) {
            return false; // Input is not a valid integer
        }
    }
    
    private void setupCheckBoxListeners() {
        // Add a listener to each checkbox
        liq1_checkbox.selectedProperty().addListener((obs, oldValue, newValue) -> handleCheckboxChange());
        liq2_checkbox.selectedProperty().addListener((obs, oldValue, newValue) -> handleCheckboxChange());
        liq3_checkbox.selectedProperty().addListener((obs, oldValue, newValue) -> handleCheckboxChange());
        liq4_checkbox.selectedProperty().addListener((obs, oldValue, newValue) -> handleCheckboxChange());

        // Initialize the UI state
        handleCheckboxChange();
    }

    private void handleCheckboxChange() {
    	this.boxHasBeenChecked = liq1_checkbox.isSelected() || liq2_checkbox.isSelected() || liq3_checkbox.isSelected() || liq4_checkbox.isSelected();
        updateSubmitButton();

        // Enable or disable text fields based on checkbox state
        liq1_quant.setDisable(!liq1_checkbox.isSelected());
        liq2_quant.setDisable(!liq2_checkbox.isSelected());
        liq3_quant.setDisable(!liq3_checkbox.isSelected());
        liq4_quant.setDisable(!liq4_checkbox.isSelected());
    }
    

    private void addTotalEnterKeyHandler(TextField textField) {
        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                // Handle Enter key press
            	validateTotal();
            }
        });
    }
    
    private void addQuantityEnterKeyHandler(TextField textField) {
        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                this.quantity = Integer.parseInt(quantity_input.getText());
                updateSubmitButton();
            }
        });
    }

    
    // Check the total of each liquid quantity if the liquid type has been selected
    private void validateTotal() {
    	this.total = 0;
        if (liq1_checkbox.isSelected() && !liq1_quant.getText().isEmpty()) {
        	this.liquidPercent.set(0, Integer.parseInt(liq1_quant.getText()));
            this.total += Integer.parseInt(liq1_quant.getText());
        }
        if (liq2_checkbox.isSelected() && !liq2_quant.getText().isEmpty()) {
        	this.liquidPercent.set(1, Integer.parseInt(liq2_quant.getText()));
        	this.total += Integer.parseInt(liq2_quant.getText());
        }
        if (liq3_checkbox.isSelected() && !liq3_quant.getText().isEmpty()) {
        	this.liquidPercent.set(2, Integer.parseInt(liq3_quant.getText()));
        	this.total += Integer.parseInt(liq3_quant.getText());
        }
        if (liq4_checkbox.isSelected() && !liq4_quant.getText().isEmpty()) {
        	this.liquidPercent.set(3, Integer.parseInt(liq4_quant.getText()));
        	this.total += Integer.parseInt(liq4_quant.getText());
        }
        System.out.println(this.liquidPercent.toString());
        if (this.total != 100) {
        	// set a flag to disable the submit button 
        	this.totalIsCorrect = false;
        	
        }else{
          	// set a flag to enable the submit button 
        	this.totalIsCorrect = true;
        }
        updateSubmitButton();

        // set total on the label
        label_total_percent.setText(this.total + "%");
    }
    
    
    @FXML
    void onCancelBtnClicked(MouseEvent event) {
    	 Stage stage = (Stage) cancel_btn.getScene().getWindow();
    	 stage.close();
    }

    @FXML
    void onSubmitBtnClicked(MouseEvent event) {
    	Order order = new Order(this.orderNumber,this.customer.getCustomerID(), this.liquidPercent, this.quantity, "Queued");
    	this.customer.addOrderToList(order);
    	
    	// update history table in Home page
    	if (homeController != null) {
            homeController.updateOrderHistoryTable();
        }
    	
    	// Send to SysJ
    	this.sendOrderToOrchestrator(order);
    	Stage stage = (Stage) submit_btn.getScene().getWindow();
   	 	stage.close();
    	
    }
    
    
    public void sendOrderToOrchestrator(Order order) {
    	//TODO sockets here
		try {
			SimpleClient s = new SimpleClient("127.0.0.1", 40000, "OrchestratorCD", "order");
			System.out.println("init simple client");
    		s.emit(order, 5); // Emitting an order for 10 ms
    		System.out.println("emitted order to orch");
//    		s.close(); // close when necessary
    		
		}catch (IOException e) {
			e.printStackTrace();
		}
    	
    }

    
    
}
