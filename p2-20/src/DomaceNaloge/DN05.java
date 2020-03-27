package DomaceNaloge;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DN05 {
    public static void main(String[] args) throws Exception{
        //izpis tabele 1, 0 labirinta
        int [][] labirint = preberiLabirint(args[0]);
        /*for (int i = 0; i < labirint.length ; i++){
            for (int j = 0; j < labirint[i].length; j++) {
                System.out.print(labirint[i][j]);
            }
            System.out.println();
        }*/

        //izpis rešitve labitinta
        int [] prebranaResitev = preberiResitev(args[1]);
        for (int i = 0; i < prebranaResitev.length; i++) {
            System.out.print(prebranaResitev[i]);
        }

        System.out.println();
        izrisiLabirint(labirint);
        System.out.println();

        //izpis pravilnosti rešitve
        if (preveriResitev(labirint, prebranaResitev)) {
            System.out.println("Pravilna rešitev!");
        }
        else {
            System.out.println("Nepravilna rešitev!");
        }
    }

    public static int[][] preberiLabirint(String datoteka) throws Exception{
            Scanner sc = new Scanner(new File(datoteka));
            int branje;
            String [] labirint = datoteka.split("_|\\.");
            //String [] velikosti = labirint[3].split("\\.");
            //char b = labirint[2].charAt(0); -> ne dela za dvomestna števila
            int sirina = Integer.parseInt(labirint[1]) * 2 - 1;
            int visina = Integer.parseInt(labirint[2]) * 2 - 1;
            int [][] st = new int[visina][sirina];
            int i = 0, j = 0;

            while (sc.hasNextLine()) {
                branje = sc.nextInt();
                //System.out.print(branje);
                st[i][j] = branje;
                if (j == sirina - 1) {
                    j = 0;
                    i++;
                    System.out.println();
                }
                else {
                    j++;
                }
            }
            sc.close();
        return st;
    }

    //0-stena, 1-hodnik
    public static void izrisiLabirint(int[][] labirint) {
        for (int i = 0; i <= labirint.length + 1; i++) {
            System.out.print("# ");
        }

        System.out.println();
        for (int i = 0; i < labirint.length; i++) {
            System.out.print("# ");
            for (int j = 0; j < labirint[i].length; j++) {
                if (labirint[i][j] == 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println("# ");
        }

        for (int i = 0; i <= labirint.length + 1; i++) {
            if (i == labirint.length) {
                System.out.print("  ");
            }
            else {
                System.out.print("# ");
            }
        }
    }

    public static int[] preberiResitev(String ime) throws Exception {
        Scanner sc = new Scanner(new File(ime));
        String branje = "";
        int counter = 0;
        int [] prebrano = new int[100];
        while (sc.hasNext()) {
            branje = sc.next();
            prebrano[counter] = Integer.parseInt(branje);

            counter++;
        }
        return prebrano;
    }

    public static boolean preveriResitev(int[][] labirint, int[] resitev) {
        for (int i = 0; i < resitev.length; i++) {
            for (int j = 0; j < labirint.length; j++) {
                for (int k = 0; k < labirint[j].length; k++) {

                }
            }
    }
        return true;
    }
}