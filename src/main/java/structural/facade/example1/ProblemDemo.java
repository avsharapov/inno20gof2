package structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProblemDemo {
  private static Logger logger = LoggerFactory.getLogger(ProblemDemo.class);

  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:db");
        Statement sta = conn.createStatement()) {

      sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR (20), City VARCHAR(20))");
      logger.info("Table created.");

      int count = sta.executeUpdate(
          "INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
      logger.info("{} record(s) created.", count);


      ResultSet rs = sta.executeQuery("SELECT * FROM Address");
      while (rs.next()) {
        logger.info("{} {} {}", rs.getString(1), rs.getString(2), rs.getString(3));
      }
    } catch (SQLException e) {
      logger.error("ОЙ.", e);
    }
  }
}
