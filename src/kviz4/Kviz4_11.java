
package kviz4;

import java.util.Collections;
import java.util.Stack;



public class Kviz4_11 {
    
    interface SkladInterface {
        public boolean isEmpty();   // je sklad prazen?
        public void push(Object o); // doda element na vrh sklada
        public Object pop();        // vrne element z vrha sklada
        public void reverse();      // obrne vrstni red elementov na skladu
    }
    
    public static class Sklad implements SkladInterface {
        java.util.Stack<Object> sklad = new java.util.Stack<>();

        @Override
        public boolean isEmpty() {
            return sklad.isEmpty();
        }

        @Override
        public void push(Object o) {
            sklad.push(o);
        }

        @Override
        public Object pop() {
            return sklad.pop();
        }

        @Override
        public void reverse() {
            sklad.sort(Collections.reverseOrder());
        }
    }   
   
    
}
