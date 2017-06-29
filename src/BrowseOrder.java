public class BrowseOrder extends AbstractBrowseOrder {
	
		@Override
		public Order createBrowseOrderUsingCvosOrder(CvosOrder cvosOrder) {
			Order order = new Order();
        		order.orderId = cvosOrder.orderId;
        		order.messages = cvosOrder.messages;
			return order;
		}
}
