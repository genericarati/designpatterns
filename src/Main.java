
public class Main {
	public static Order getOrder(CvosOrder cvosOrder) {
		if (cvosOrder.orderId != null && cvosOrder.messages != null) {
			return new BrowseOrder().createBrowseOrderUsingCvosOrder(cvosOrder);
		}
		return new NullBrowseOrder().createBrowseOrderUsingCvosOrder(cvosOrder);
	}
}
