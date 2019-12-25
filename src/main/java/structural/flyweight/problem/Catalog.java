package structural.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
  private List<Item> items = new ArrayList<>();

  public void add(Item item) {
    items.add(item);
  }

  public int totalItemsMade() {
    return items.size();
  }

  @Override public String toString() {
    return "Catalog{" +
        "items=" + items +
        '}';
  }
}
