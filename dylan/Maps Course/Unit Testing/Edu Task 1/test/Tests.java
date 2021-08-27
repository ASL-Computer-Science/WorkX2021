import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Dylan", 98);
    map.put("Joe", 75);
    map.put("Susan", 92);
    map.put("John", 85);
    map.put("Steve", 99);
    map.put("Phoebe", 100);
    map.put("Marco", 50);
    map.put("Aaron", 96);
    map.put("Taylor", 100);
    Set<String> keys = map.keySet();
    ArrayList<String> list = new ArrayList<>();
    for (String k : keys) {
      if (map.get(k) >= 98) list.add(k);
    }
    Assert.assertEquals(list, Task.getBestScores(map));
  }
}