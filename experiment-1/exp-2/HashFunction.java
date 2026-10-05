import java.util.HashMap;

public class HashFunction {
  public static void main(String[] args) {
    // country (key) -> population (value)
    HashMap<String, Integer> map = new HashMap<>();
    // insert
    map.put("India", 120);
    map.put("China", 150);
    map.put("USA", 100);
    map.put("Russia", 130);
    map.put("Japan", 110);
    map.put("Germany", 90);
    map.put("France", 80);
    map.put("Italy", 70);
    map.put("Spain", 60);

    System.out.println(map);
    // search
    if (map.containsKey("India")) {
      System.out.println("Key is present in the map");
    } else {
      System.out.println("Key is not present in the map");
    }
    // get
    System.out.println(map.get("India"));

    // remove
    map.remove("China");
    System.out.println(map);
    // containsValue
    if (map.containsValue(120)) {
      System.out.println("Value is present in the map");
    } else {
      System.out.println("Value is not present in the map");
    }
    // size
    System.out.println(map.size());
    // isEmpty
    if (map.isEmpty()) {
      System.out.println("Map is empty");
    } else {
      System.out.println("Map is not empty");
    }
    // clear
    map.clear();
    System.out.println(map);
  }
} 
