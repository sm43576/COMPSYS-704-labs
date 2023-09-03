import java.util.*;

public class Customer {
	private String id;
	private List<Order> orderList;
	
	public Customer() {
		this.id = null;
		this.orderList =  new ArrayList<Order>();
	}
	
	public void setCustomerID(String id) {this.id=id;}
	public String getCustomerID() {return this.id;}
	public List<Order> getOrdersList(){return this.orderList;}
	public void addOrderToList(Order order) {this.orderList.add(order);}
}
