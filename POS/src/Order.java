import java.util.*;

public class Order {
	int orderNum;
	String customerID;
	int quantity;
	HashMap<String,Integer> liquidSpecs;
	String orderStatus;
	
	public Order(int orderNum, String customerID, List<Integer> liquidPercent, int quantity, String status) {
		this.orderNum = orderNum;
		this.customerID = customerID;
		this.quantity = quantity;
		this.liquidSpecs = new HashMap<>();
		this.orderStatus = status;
		
		// Create hashmap of liquid specs, where key = "Liquid x" and value = percentage of liquid x
		String liquidType;
        for(int i=0; i<liquidPercent.size(); i++){
            liquidType = String.format("Liquid %s", i+1);
		    liquidSpecs.put(liquidType, liquidPercent.get(i));
        }
		
	}
	
	public int getOrderNum() {return this.orderNum;}
	public String getCustomerID() {return this.customerID;}
	public int getQuantity() {return this.quantity;}
	public HashMap<String,Integer> getLiquidSpec() {return this.liquidSpecs;} // Only for UI use
	public String getOrderStatus() {return this.orderStatus;}
	public void setOrderStatus(String status) {this.orderStatus = status;}
	
	// To access the a particular liquid's percentage in SystemJ
	public int getSpecificLiquidPercentage(String liquid) {
		int percentage = this.liquidSpecs.get(liquid);
		System.out.println(percentage);
		return percentage;
	}
	

}
