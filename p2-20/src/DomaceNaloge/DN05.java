package DomaceNaloge;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DN05 {
    public static void main(String[] args) throws Exception{
        System.out.println(Arrays.deepToString(preberiLabirint(args[0])));
        //testna tabela
        int [][] labirint = new int[5][5];
        labirint[0][0] = 1;
        labirint[0][1] = 1;
        labirint[0][2] = 1;
        labirint[0][3] = 1;
        labirint[0][4] = 1;

        labirint[1][0] = 1;
        labirint[1][1] = 0;
        labirint[1][2] = 0;
        labirint[1][3] = 0;
        labirint[1][4] = 1;

        labirint[2][0] = 1;
        labirint[2][1] = 0;
        labirint[2][2] = 1;
        labirint[2][3] = 1;
        labirint[2][4] = 1;

        labirint[3][0] = 1;
        labirint[3][1] = 0;
        labirint[3][2] = 1;
        labirint[3][3] = 0;
        labirint[3][4] = 1;

        labirint[4][0] = 1;
        labirint[4][1] = 1;
        labirint[4][2] = 1;
        labirint[4][3] = 1;
        labirint[4][4] = 1;

        izrisiLabirint(labirint);
    }

    public static int[][] preberiLabirint(String datoteka) throws Exception{
            Scanner sc = new Scanner(new File(datoteka));
            int branje;
            String [] labirint = datoteka.split("_");
            char b = labirint[2].charAt(0);
            int sirina = Integer.parseInt(labirint[1]) * 2 - 1;
            int visina = Integer.parseInt(String.valueOf(b)) * 2 - 1;
            int [][] st = new int[visina][sirina];
            int i = 0, j = 0;

            while (sc.hasNextLine()) {
                branje = sc.nextInt();
                System.out.print(branje);
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
        for (int i = 0; i < labirint.length; i++) {
            for (int j = 0; j < labirint[i].length; j++) {
                if (labirint[i][j] == 0) {
                    System.out.print("# ");
                }
                else if (labirint[i][j] == 1) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}