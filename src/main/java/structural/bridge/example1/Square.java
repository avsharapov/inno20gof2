package structural.bridge.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape {
  private static Logger logger = LoggerFactory.getLogger(Square.class);

  public Square(Color color) {
    super(color);
  }

  @Override
  void applyColor() {
    logger.info("{} square", color.applyColor());
  }
}
