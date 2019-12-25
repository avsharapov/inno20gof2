package structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
  private static Logger logger = LoggerFactory.getLogger(JdbcFacade.class);
  private Connection conn = null;

  public JdbcFacade() {
    try {
      conn = DriverManager.getConnection("jdbc:h2:mem:db");
    } catch (SQLException e) {
      logger.error("ОЙ.", e);
    }
  }

  public int createTable() {
    int count = 0;
    try (Statement sta = conn.createStatement()
    ) {
      count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR (20), City VARCHAR(20))");
    } catch (Exception e) {
      logger.error("ОЙ.", e);
    }
    return count;
  }

  public int insertIntoTable(int id, String streetName, String city) {
    int count = 0;
    try (PreparedStatement psta = conn.prepareStatement(
        "INSERT INTO Address (ID, StreetName, City) values (?, ?, ?)")) {
      psta.setInt(1, id);
      psta.setString(2, streetName);
      psta.setString(3, city);
      count = psta.executeUpdate();
      logger.error("{} record(s) created.", count);
    } catch (Exception e) {
      logger.error("ОЙ.", e);
    }
    return count;
  }

  public List<Address> getAddresses() {
    List<Address> addresses = new ArrayList<>();
    try (Statement sta = conn.createStatement();
        ResultSet rs = sta.executeQuery("SELECT * FROM Address")) {
      while (rs.next()) {
        addresses.add(new Address(rs.getString(1), rs.getString(2), rs.getString(3)));
      }
    } catch (SQLException e) {
      logger.error("ОЙ.", e);
    }
    return addresses;
  }
}
