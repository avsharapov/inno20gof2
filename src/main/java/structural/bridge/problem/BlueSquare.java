package structural.bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueSquare extends Square {
  private static Logger logger = LoggerFactory.getLogger(BlueSquare.class);

  @Override
  void applyColor() {
    logger.info("Apply the blue color to the square");
  }
}
