package structural.bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueCircle extends Circle {
  private static Logger logger = LoggerFactory.getLogger(BlueCircle.class);

  @Override
  void applyColor() {
    logger.info("Apply the blue color to the circle");
  }
}
