package structural.bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedSquare extends Square {
  private static Logger logger = LoggerFactory.getLogger(RedSquare.class);

  @Override
  void applyColor() {
    logger.info("Apply the red color to the square");
  }
}
