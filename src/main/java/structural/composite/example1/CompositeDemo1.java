package structural.composite.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompositeDemo1 {
  private static Logger logger = LoggerFactory.getLogger(CompositeDemo1.class);

  public static void main(String[] args) {
    Menu mainMenu = new Menu("Main", "/main");

    MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
    mainMenu.add(safetyMenuItem);

    Menu claimsSubMenu = new Menu("Claims", "/claims");
    mainMenu.add(claimsSubMenu);

    MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
    claimsSubMenu.add(personalClaimsMenu);

    logger.info("{}", mainMenu);
  }
}
