import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
		CvosOrder cvosOrder = new CvosOrder();
		cvosOrder.orderId ="Order Id1";
		cvosOrder.messages = (List<String>) new ArrayList<String>();
		cvosOrder.messages.add("first message");
		
		Order order = Main.getOrder(cvosOrder);
		System.out.println("Not a null order -"+ order.orderId);
		
		CvosOrder cvosOrder1 = new CvosOrder();
		cvosOrder1.orderId ="Order Id2";
		cvosOrder1.messages = null;
		
		Order order1 = Main.getOrder(cvosOrder1);
		System.out.println("null order -"+ order1.orderId);
		
		
	}
}
