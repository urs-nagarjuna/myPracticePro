package collectionPrograms;

import java.util.*;

class HashMapDemo{
    public static void main(String[] args) {


        LinkedHashMap m = new LinkedHashMap();

        m.put("Chiru",1000);
        m.put("null",1000);
        m.put("Venky",800);
        m.put("null",700);
        System.out.println(m);

        System.out.println(m.put("Chiru", 2000));

        Set s = m.keySet();
        System.out.println(s);

        m.get("chiru");
        Collection c = m.values();
        System.out.println(c);

        Set s1 = m.entrySet();
        System.out.println(s1);



    }
}
