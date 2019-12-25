package structural.proxy.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealImage implements Image {
  private static Logger logger = LoggerFactory.getLogger(RealImage.class);
  private String filename;

  public RealImage(final String filename) {
    this.filename = filename;
    loadImageFromDisk();
  }

  private void loadImageFromDisk() {
    logger.info("Loading {}", filename);
  }

  @Override
  public void displayImage() {
    logger.info("Displaying {}", filename);
  }
}
