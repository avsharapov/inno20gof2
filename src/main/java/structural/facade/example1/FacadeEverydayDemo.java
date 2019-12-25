package structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {
  private static Logger logger = LoggerFactory.getLogger(FacadeEverydayDemo.class);

  public static void main(String[] args) throws Exception {
    URL url = new URL("http", "innopolis.ru", 80, "/");

    try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        logger.info("{}", inputLine);
      }
    }

  }
}
