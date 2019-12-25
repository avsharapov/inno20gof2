package structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FacadeDemo1 {
  private static Logger logger = LoggerFactory.getLogger(FacadeDemo1.class);

  public static void main(String[] args) {
    JdbcFacade jdbcFacade = new JdbcFacade();

    jdbcFacade.createTable();
    logger.info("Table created.");

    jdbcFacade.insertIntoTable(1, "1234 Some street", "Layton");
    logger.info("Record(s) inserted.");

    List<Address> addresses = jdbcFacade.getAddresses();
    for (Address address : addresses) {
      logger.info("{}", address);
    }
  }
}
