package structural.bridge.example1;

public class BridgeDemo1 {
  public static void main(String[] args) {
    Color blue = new Blue();
    Shape blueSquare = new Square(blue);

    Color red = new Red();
    Shape redCircle = new Circle(red);

    blueSquare.applyColor();
    redCircle.applyColor();

    Color green = new Green();
    Shape greenCircle = new Circle(green);
    greenCircle.applyColor();
  }
}
