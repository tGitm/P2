package Vaje;

public class Vaje5 {
    public static void main(String[] args) {
        Seznam seznam = new Seznam();
    }

}

class Seznam {
    private String [] seznam;
    private static int dolzina = 0;

    void narediSeznam(int n) {
        seznam = new String[n];
        dolzina = n;
        if (dolzina != 0) System.out.printf("%s %d %s", "Seznam z dolžino ", n, " je že narejen.\n");
    }

    void dodajNaSeznam(String element) {
        int counter = 0;
        if (dolzina == 0) { System.out.println("Seznam še ni narejen"); }
        else {
            seznam[counter++] = element;
        }
        for (int i = 0; i < seznam.length; i++) {
            if (i > dolzina) {
                System.out.println("Seznam je poln. Element ni bil dodan.");
            }
        }
    }

    void odstraniIzSeznama(int mesto) {
        if (seznam[mesto].equals(0)) {
            System.out.printf("%s %d %s", "Na mestu ", mesto, " ni elementa.");
        }
        if (dolzina == 0) { System.out.println("Seznam še ni narejen"); }
        for (int i = 0; i < seznam.length; i++) {
            if (seznam[i].equals(mesto)) {
                for (int j = 0; j < seznam.length - 1; j++) {
                    seznam[j] = seznam[j + 1];
                }
            }
        }
    }

    void izpisiSeznam() {
        System.out.println("Na seznamu so sledeči elementi: ");

    }
}
