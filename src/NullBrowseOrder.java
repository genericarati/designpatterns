import java.util.ArrayList;

public class NullBrowseOrder extends AbstractBrowseOrder {


	@Override
	public Order createBrowseOrderUsingCvosOrder(CvosOrder cvosOrder) {
		Order order = new Order();
    		order.orderId = "I am a null order";
    		order.messages = new ArrayList<>();
		return order;
	}
}
