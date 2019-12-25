package structural.flyweight.problem;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
  private final Catalog catalog = new Catalog();
  private final List<Order> orders = new CopyOnWriteArrayList<>();

  void takeOrder(Item item, int orderNumber) {
    catalog.add(item);
    Order order = new Order(orderNumber, item);
    orders.add(order);
  }

  void process() {
    for (Order order : orders) {
      order.processOrder();
      orders.remove(order);
    }
  }

  String report() {
    return "\nTotal Item objects made: " + catalog.totalItemsMade();
  }

  String fullReport() {
    return catalog.toString();
  }
}
