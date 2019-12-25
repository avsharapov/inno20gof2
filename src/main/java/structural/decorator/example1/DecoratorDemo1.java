package structural.decorator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorDemo1 {
  private static Logger logger = LoggerFactory.getLogger(DecoratorDemo1.class);

  public static void main(String[] args) {
    Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
    logger.info("{}", sandwich.make());
  }
}
