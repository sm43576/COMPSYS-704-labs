import java.util.*;

public class Customer {
	int id;
	List<Order> orderList;
	
	public Customer(int id) {
		this.id = id;
		this.orderList =  new ArrayList<Order>();
	}
	
	public List<Order> getOrdersList(){return this.orderList;}
	public void addOrderToList(Order order) {this.orderList.add(order);}
}
