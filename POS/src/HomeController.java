import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    
    @FXML
    public void initialize() {
//        order_hist_title.setText("Order History");
        System.out.println("Initialised");
    }
    
    @FXML
    private void printOutput() {
    	System.out.println("Here");
    	System.out.println(customer_ID_input.getText()); // BAD
    	order_hist_title.setText(customer_ID_input.getText());
    }
    
}