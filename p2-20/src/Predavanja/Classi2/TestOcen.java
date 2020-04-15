package Predavanja.Classi2;

public class TestOcen {

    public static void main(String[] args) {
        Ocene o1 = new Ocene();
        o1.dodajOceno(10);
        o1.dodajOceno(8);
        o1.dodajOceno(9);
        System.out.println(o1.getStatus());
    }
}
