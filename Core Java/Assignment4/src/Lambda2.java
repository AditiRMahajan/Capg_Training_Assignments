import java.util.*;
/**
 * Class odders consist of order price and its status
 * @author ADITI
 *
 */
class Orders{
	private int price=0;
	private String status="";
	
	public Orders(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orders [price=" + price + ", status=" + status + "]";
	}
}

@FunctionalInterface
interface orderCheck {
	boolean check(Orders obj);
}

/**
 *Driver Class
 */

public class Lambda2{
	
	public static void main(String[] args) {
		//Create list of orders
		List<Orders> orders = Arrays.asList(new Orders(7000,"Accepted"),
				new Orders(13000,"Completed"),
				new Orders(20000,"Completed"),
				new Orders(4000,"Accepted"),
				new Orders(16000,"Completed"));
		
		//Print orders list
		System.out.println("Orders List: "+orders);
		
		//Lambda Expression to check if order price is greater than Rs.10000 or not
		orderCheck chk = obj -> obj.getPrice() > 10000;
		for(Orders o : orders) {
			System.out.println("\nIs order price greater than Rs.10000: "+chk.check(o));
		}
		
	}
}

