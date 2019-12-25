package structural.flyweight.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Order {
  private static Logger logger = LoggerFactory.getLogger(Order.class);
  private final int orderNumber;
  private final Item item;

  public Order(int orderNumber, Item item) {
    this.orderNumber = orderNumber;
    this.item = item;
  }

  void processOrder() {
    logger.info("Ordering {} for order number {}.", item, orderNumber);
  }
}
