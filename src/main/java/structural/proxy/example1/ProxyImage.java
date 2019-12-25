package structural.proxy.example1;

public class ProxyImage implements Image {

  private RealImage image = null;
  private String filename;

  public ProxyImage(final String filename) {
    this.filename = filename;
  }

  @Override
  public void displayImage() {
    if (image == null) {
      image = new RealImage(filename);
    }
    image.displayImage();
  }
}
