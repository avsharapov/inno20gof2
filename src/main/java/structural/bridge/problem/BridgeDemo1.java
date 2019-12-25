package structural.bridge.problem;

public class BridgeDemo1 {
  public static void main(String[] args) {
    Circle circle = new BlueCircle();
    Square square = new RedSquare();

    circle.applyColor();
    square.applyColor();
  }
}
