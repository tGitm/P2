package DomaceNaloge;

import java.io.File;
import java.io.FileNotFoundException;
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
        int [] prebranaResitev = preberiResitev(args[1]);
        if (args.length == 2) {
            izrisiLabirint(labirint);
            System.out.println();
            //izpis pravilnosti rešitve
            if (preveriResitev(labirint, prebranaResitev)) {
                System.out.println("Pravilna resitev!");
            }
            else {
                System.out.println("Nepravilna resitev!");
            }
        }
        //izpis rešitve labirinta
        else {
            for (int i = 0; i < prebranaResitev.length; i++) {
                System.out.print(prebranaResitev[i]);
            }
        }
    }

    public static int[][] preberiLabirint(String datoteka) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(datoteka));
            String branje = "";
            String [] labirint = datoteka.split("_|\\.");
            //String [] velikosti = labirint[3].split("\\.");
            //char b = labirint[2].charAt(0); -> ne dela za dvomestna števila
            int sirina = Integer.parseInt(labirint[1]) * 2 - 1;
            int visina = Integer.parseInt(labirint[2]) * 2 - 1;
            int [][] st = new int[visina][sirina];
            int i = 0, j = 0;

            while (sc.hasNext()) {
                branje = sc.next();
                //System.out.print(branje);
                st[i][j] = Integer.parseInt(branje);
                if (j == sirina - 1) {
                    j = 0;
                    i++;
                    //System.out.println();
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
        for (int i = 0; i < labirint[1].length + 2; i++) {
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

        for (int i = 0; i < labirint[1].length + 2; i++) {
            if (i == labirint.length) {
                System.out.print("  ");
            }
            else {
                System.out.print("# ");
            }
        }
    }

    public static int[] preberiResitev(String ime) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(ime));
        String branje = "";
        int counter = 0;
        int [] prebrano = new int[100];
        while (sc.hasNext()) {
            branje = sc.next();
            prebrano[counter] = Integer.parseInt(branje);
            counter++;
        }
        sc.close();
        return prebrano;
    }

    public static boolean preveriResitev(int[][] labirint, int[] resitev) {
        int i = 0;
        int j = 0;
        boolean reseno = true;
        for (int k = 0; k < resitev.length; k++) {
            int smeri = resitev[k];
            switch (smeri) {
                case 2:
                break;
                case 3: j--;
                break;
                case 4: j++;
                break;
                case 5: i--;
                break;
                case 6: i++;
                break;
            }
            if (labirint[i][j] == 0) {
                reseno = false;
            }
            if (j < labirint.length) {
                return false;
            }

        }
        return reseno;
    }
}