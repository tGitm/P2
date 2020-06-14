package Kvizi;

import java.util.ArrayList;

public class Presek {
    public static void main(String[] args) {
        int []tab1 = {3,6,9,1,3,5};
        int []tab2 = {3,4,6,1,3,8};
        System.out.println(presek(tab1, tab2));
    }

    public static int[] presek(int[] tabela1, int[] tabela2) {
        java.util.ArrayList<Integer> vEniInDrugi= new java.util.ArrayList<Integer>();
        for (int i : tabela1) {
            for (int j : tabela2) {
                if (!vEniInDrugi.contains(i)) {
                    if (i == j) {
                        vEniInDrugi.add(i);
                    }
                }
            }
        }

        int[] tabPresek = new int[vEniInDrugi.size()];

        int counter = 0;
        for (int i : vEniInDrugi) {
            tabPresek[counter++] = i;
        }
        return tabPresek;
    }
}
