package structural.decorator.example1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecoratorEverydayDemo {
  public static void main(String[] args) throws IOException {
    File file = new File("./output.txt");
    try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
      dataOutputStream.writeChars("text");
    }
  }
}
