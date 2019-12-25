package structural.bridge.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BridgeDemo2 {
  private static Logger logger = LoggerFactory.getLogger(BridgeDemo2.class);

  public static void main(String[] args) {
    Movie movie = new Movie();
    movie.setClassification("Action");
    movie.setTitle("John Wick");
    movie.setRuntime("2:15");
    movie.setYear("2015");

    Book book = new Book();
    book.setAuthor("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides");
    book.setTitle("Design Patterns");
    book.setContPage("395");
    book.setYear("1994");

    Formatter printFormatter = new PrintFormatter();
    Printer moviePrinter = new MoviePrinter(movie);
    Printer bookPrinter = new BookPrinter(book);

    logger.info("{}", moviePrinter.print(printFormatter));
    logger.info("======================================");
    logger.info("{}", bookPrinter.print(printFormatter));
  }
}
