package Kvizi;

public class Range {
    public static void main(String[] args) {
        System.out.println(range(0, 10, 2));
        System.out.println(range(5, 20, 3));
    }

    public static int[] range(int a, int b, int c) {
        java.util.ArrayList<Integer> doseg = new java.util.ArrayList<Integer>();
        for (int i = a; i < b; i+=c) {
            doseg.add(i);
        }

        //pretvorba arrayLista v klasicen array
        int[] tab = new int[doseg.size()];

        int counter = 0;
        for (int i : doseg) {
            tab[counter++] = i;
        }
        return tab;
    }
}
