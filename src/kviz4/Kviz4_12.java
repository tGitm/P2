package kviz4;
import java.util.ArrayList;


public class Kviz4_12 {
    
    public static class ArrayListPlus extends ArrayList<String> {

        ArrayListPlus() {
            super();    //calls parent constructor
        }

        ArrayListPlus(String elements) {
            String[] elementi = elements.split(";");
            for (String podatek : elementi) {
                this.add(podatek);
            }
        }

        public String set(int index, String element) {
            if (index >= this.size()) {
                for (int i = 0; i < index; i++) {
                    if (i >= this.size()) {
                        this.add("");
                    } else if (this.get(i) == null) {
                        this.set(index, "");            //?
                    }
                }
                this.add(element);
                return element;
            }
            return super.set(index, element);
        }

        @Override
        public String toString() {
            String s = "";
            for (String value : this) {
                s+=(String.format("%s;", value));
            }
            return s.toString().substring(0, s.length() - 1);
        }
    }
    
}
