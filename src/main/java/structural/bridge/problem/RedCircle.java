package structural.bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedCircle extends Circle {
  private static Logger logger = LoggerFactory.getLogger(RedCircle.class);

  @Override
  void applyColor() {
    logger.info("Apply the red color to the circle");
  }
}
