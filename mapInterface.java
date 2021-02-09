package collectionPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapInterface {
    public static void main(String[] args) {

        Map<String , Integer> m = new HashMap<>();
        m.put("Nagarjuna",100);
        m.put("Ravi",200);
        m.put("Raje",300);
        m.put("Venu",400);
        m.put("Uday",500);

        // Get all keys
        Set<String> keys = m.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k);
        }

        // Using keySet() to get the set view of keys
        System.out.println("The set is: " + m.keySet());

        // Get all values
        Collection<Integer> values = m.values();
        for (Integer v : values) {
            System.out.println("Value: " + v);

           /* int val[] = new int[m.size()];

            for(Integer v1 : m.values()) {
                System.out.println(v);
            }
*/

        }
    }
}

