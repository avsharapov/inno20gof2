package structural.bridge.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {
  private static Logger logger = LoggerFactory.getLogger(Circle.class);

  public Circle(Color color) {
    super(color);
  }

  @Override
  void applyColor() {
    logger.info("{} circle", color.applyColor());
  }
}
