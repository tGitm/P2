package DomaceNaloge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DN05 {
    public static void main(String[] args) {
        preberiLabirint(args[0]);
        for (int i = 0; i < stevila.length; i++) {
            for (int j = 0; j < stevila[i].length; j++) {
                System.out.print(stevila[i][j]);
            }
            System.out.println();
        }
    }

    public static int [][] stevila = new int[5][5];

    public static void append(String niz) {
        for (int i = 0; i < stevila.length; i++) {
            for (int j = 0; j < stevila[i].length; j++) {
                if (stevila[i][j] == 0);
                    stevila[i][j] = Integer.parseInt(niz);
            }
        }
    }

    public static int[][] preberiLabirint(String ime) {
        try {
            Scanner sc = new Scanner(new File("viri/labirint_3_3.txt"));
            String branje = "";
            int counter = 0;
            while (sc.hasNextLine()) {
                branje = sc.next();
                System.out.println(branje);
                append(branje);

                counter++;
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stevila;

    }


}
