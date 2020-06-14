package Kvizi;

public class Unija {
    public static void main(String[] args) {
        int []tab1 = {3,6,9,1,3,5};
        int []tab2 = {3,4,6,1,3,8};
        System.out.println(unija(tab1, tab2));
    }

    public static int[] unija(int[] tabela1, int[] tabela2) {
        int[] skupna = new int[tabela1.length + tabela2.length];

        int counter = 0;
        for (int i : tabela1) {
            skupna[counter++] = i;
        }


        for (int j : tabela2) {
            skupna[counter++] = j;
        }

        return skupna;
    }
}
