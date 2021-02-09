package collectionPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItereatorDemo {
    public static void main(String[] args) {

        LinkedList l = new LinkedList ();
        l.add("Balakrishna");
        l.add("Venky");
        l.add("Chiru");
        l.add("Nag");

        ListIterator ltr  = l.listIterator();
        while(ltr.hasNext()) {
            System.out.println(ltr.next());
        }
        while ((ltr.hasPrevious())){
            System.out.println(ltr.previous());
        }
    }
}
