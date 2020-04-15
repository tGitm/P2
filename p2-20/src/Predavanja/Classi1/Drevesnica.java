package Predavanja.Classi1;

public class Drevesnica {
    static void test2() {
        Rastlina r1 = new Rastlina();
        r1.imeRastline = "Ruuužaa";
        r1.novMesec();r1.novMesec();
        System.out.println("Starost " + r1.starost);
        r1.spremeniIme("Vrtnica");
    }

    static void test1() {
        Rastlina r1 = new Rastlina();
        r1.id = 1;
        r1.starost = 4;
        r1.imeRastline = "Mitja";

        System.out.println(r1.mesecnaRast());

        Rastlina r2 = new Rastlina();
        r2.imeRastline = "Laura";
        System.out.println("Prva rastlina " + r1.imeRastline);
        System.out.println("Druga rastlina " + r2.imeRastline);
    }

    static void test3() {
        Rastlina r1 = new Rastlina();
        //r1.ID = 1; //statičnih atributov ne uporabljam preko objekta!
        Rastlina.ID = 1;

        Rastlina r2 = new Rastlina();
        //r2.ID = 2;
        Rastlina.ID = 2;

        System.out.println(r1.ID);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();

        Rastlina.izpisiNavodilaZaObrezovanje();
    }
}
