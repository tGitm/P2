package Predavanja;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SkupniDEeliteljiMnozuca {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;

        Set<Integer> del1 = delitelji(x);
        Set<Integer> del2 = delitelji(y);

        //del1 obdrži vse in vsebuje tudi elemente del2 -> PRESEK
        del1.retainAll(del2);

        Iterator<Integer> it = del1.iterator();
        while (it.hasNext()) {
            int k = it.next();
            System.out.println(k);
        }
    }

    //hočem izpisati skupne delitelje teh dveh števil
    static Set<Integer> delitelji(int x) {
        Set<Integer> del = new HashSet<>();
        for (int i = 1; i < x/2; i++) {
            if (x % i == 0) {
                del.add(i);
            }
        }

        return del;
    }
}
