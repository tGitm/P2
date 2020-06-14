package Kvizi;

public class Duplikati {
    public static void main(String[] args) {

    }

    public static int [] duplikati(int [] tabela) {
        //enostavno grem čez tabelo in pogledat če elementa še ni v arrayListu ga dodam
        java.util.ArrayList<Integer> brezDuplikatov = new java.util.ArrayList<Integer>();
        for (int i : tabela) {
            if (!brezDuplikatov.contains(i)) {
                brezDuplikatov.add(i);
            }
        }

        //pretvorim in vrnem navadno tabelo
        int[] tab = new int[brezDuplikatov.size()];

        int counter = 0;
        for (int i : brezDuplikatov) {
            tab[counter++] = i;
        }
        return tab;
    }
}
