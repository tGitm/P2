package DomaceNaloge;

import java.io.FileNotFoundException;
import java.util.TreeSet;

public class DN10 {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(getVsiPodnizi("abcabc"));
        //String presek = getVsiPodnizi(args[0]).retainAll(getVsiPodnizi(args[1]));
        if (args.length < 1) {
            System.out.println("Vnesi vsaj 1 argument programa!");
            System.exit(0);
        }

        TreeSet<String> besede = new TreeSet<>();
        for (int i = 1; i < args.length; i++) {
            besede.retainAll(getVsiPodnizi(args[i]));
        }

        String najD = "";

        for (String d : besede) {
            if (d.length() > najD.length()) {
                najD = d;
            }
            System.out.println(najD);
        }

    }

    public static TreeSet<String> getVsiPodnizi(String niz) {
        TreeSet<String> podnizi = new TreeSet<String>();
        for (int i = 0; i < niz.length(); i++) {
            for (int j = i + 1; j < niz.length(); j++) {
                podnizi.add(niz.substring(i, j));
            }
        }

        return podnizi;
    }
}
