import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DN11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) System.exit(0);

        final HashMap<String, Integer> besede = new HashMap<>();

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNext()) {
            String beseda = sc.next();
            beseda = beseda.replaceAll("[.,!();]", "").trim();

            if (beseda.isEmpty()) continue;

            int pojavitve = besede.containsKey(beseda) ? besede.get(beseda) : 0;
            besede.put(beseda, pojavitve + 1);


        }
        sc.close();

        ArrayList<String> list = new ArrayList<>(besede.keySet());

        switch (args[1]) {
            case "1":
                //izpis urejen po pojavitvah
                Collections.sort(list, new Comperator<Object>() {

                    public int compare(Object o1, Object o2) {
                        return ((String) o1).compareTo((String) o2);
                    }
                });
                break;

            case "2":
                //izpis urejen po pojavitvah
                Collections.sort(list, new Comperator<Object>() {

                    public int compare(Object o1, Object o2) {
                        int i1 = besede.get(o1);
                        int i2 = besede.get(o2);

                        if (i1 == i2) {
                            return ((String) o1).compareTo((String) o2);
                        } else {
                            return new Integer(besede.get(o2).compareTo(besede.get(o1)));
                        }

                    }
                });
                break;
        }

        for (String beseda : list){
            System.out.printf("%-5d %s\n", besede.get(beseda), beseda);
        }
    }
}
