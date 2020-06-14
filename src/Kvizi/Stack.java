package Kvizi;

interface SkladInterface {

    public boolean isEmpty();   // je sklad prazen?

    public void push(Object o); // doda element na vrh sklada

    public Object pop();        // vrne element z vrha sklada

    public void reverse();      // obrne vrstni red elementov na skladu

}

class Stack implements SkladInterface {
    java.util.Stack<Object> stack = new java.util.Stack<Object>();

    public void push(Object o) {
        stack.push(o);
    }

    public Object pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void reverse() {
        java.util.Collections.sort(stack, java.util.Collections.reverseOrder());
    }
}
