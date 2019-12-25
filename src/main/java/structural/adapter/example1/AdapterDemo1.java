package structural.adapter.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AdapterDemo1 {
  private static Logger logger = LoggerFactory.getLogger(AdapterDemo1.class);

  public static void main(String[] args) {
    EmployeeClient client = new EmployeeClient();
    List<Employee> employees = client.getEmployeeList();

    for (Employee e : employees) {
      logger.info("({}) {} {}", e.getId(), e.getFirstName(), e.getLastName());
      logger.info("Email {}", e.getEmail());
    }
  }
}
