import java.io.Serializable;
import java.util.*;

public class Order implements Serializable {
	private int orderNum;
	private String customerID;
	private int quantity;
	private String liquidSpecDisplay;
	private String orderStatus;
	private ArrayList<Integer> liquidPercents;
	
	 StringBuilder liquidSpecBuilder = new StringBuilder();
	
	public Order(int orderNum, String customerID, ArrayList<Integer> liquidPercent, int quantity, String status) {
		this.orderNum = orderNum;
		this.customerID = customerID;
		this.quantity = quantity;
		this.orderStatus = status;
		
		this.liquidPercents = new ArrayList<Integer>();
		this.liquidPercents = liquidPercent;
		// Create hashmap of liquid specs, where key = "Liquid x" and value = percentage of liquid x
		String liquidType;
        for(int i=0; i<liquidPercent.size(); i++){
            liquidType = String.format("Liquid %s", i+1);
		    liquidSpecBuilder.append(liquidType).append(": ").append(liquidPercent.get(i)).append(", ");
        }
        this.liquidSpecDisplay = liquidSpecBuilder.toString().replaceAll(", $", "");
//        System.out.println(this.liquidPercents.toString());
//        System.out.println(this.liquidSpecDisplay);
		
	}
	
	public int getOrderNum() {return this.orderNum;}
	public String getCustomerID() {return this.customerID;}
	public int getQuantity() {return this.quantity;}
	public String getOrderStatus() {return this.orderStatus;}
	public void setOrderStatus(String status) {this.orderStatus = status;}
	public String getLiquidSpecDisplay() {return this.liquidSpecDisplay;}
	public ArrayList<Integer> getLiquidPercentageArray() {
		return this.liquidPercents;
	}

}
