package structural.bridge.example1;

public abstract class Shape {
  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  void applyColor() {
    color.applyColor();
  }
}
