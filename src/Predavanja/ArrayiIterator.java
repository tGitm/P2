package Predavanja;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayiIterator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> dvaDim;

        list.add(5);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(4);

        //System.out.println(list.get(1));
        //System.out.println(list.contains(8));
       //System.out.println(list.size());


        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            System.out.print(x);
        }

        System.out.println();

        for (Integer i : list) {
            System.out.print(i);
        }
    }
}
