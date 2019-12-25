package structural.flyweight.problem;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyweightDemo {
  private static Logger logger = LoggerFactory.getLogger(FlyweightDemo.class);

  public static void main(String[] args) {
    InventorySystem is = new InventorySystem();

    is.takeOrder(new Item("Roomba"), 221);
    is.takeOrder(new Item("Bose Headphones"), 361);
    is.takeOrder(new Item("Samsung TV"), 432);
    is.takeOrder(new Item("Samsung TV"), 323);
    is.takeOrder(new Item("Roomba"), 536);
    is.takeOrder(new Item("Bose Headphones"), 321);
    is.takeOrder(new Item("Samsung TV"), 54);
    is.takeOrder(new Item("Roomba"), 34);
    is.takeOrder(new Item("Bose Headphones"), 365);
    is.takeOrder(new Item("Samsung TV"), 332);
    is.takeOrder(new Item("Roomba"), 456);

    is.process();
    logger.info("{}", is.report());
    logger.info("{}", is.fullReport());
  }
}
