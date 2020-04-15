package Predavanja.Classi2;

import Predavanja.Classi1.Rastlina;

public class Drevesnica {

    static void test1() {
        RastlinaKonstruktor r1 = new RastlinaKonstruktor();
        RastlinaKonstruktor r2 = new RastlinaKonstruktor();
        RastlinaKonstruktor r3 = new RastlinaKonstruktor("Vrtnica");

        System.out.println(RastlinaKonstruktor.ID);
        System.out.println(r1.id);
        System.out.println(r2.id);
        System.out.println(r3.id);

    }

    static void test2() {
        Drevo d1 = new Drevo();
        d1.novMesec();
        d1.novMesec();
        d1.spremeniIme("Hrast");
        d1.izrisiSe();

        RastlinaKonstruktor r1 = new RastlinaKonstruktor();
        r1.spremeniIme("Vrtnica");
        System.out.println(r1.toString());
        System.out.println(d1.toString()); //izpisal bo tega ker je zadnji
    }

    static void test3() {
        RastlinaKonstruktor r1 = new RastlinaKonstruktor();
        r1.novMesec();
        r1.novMesec();
        r1.novMesec();

        r1.setVelikost(100);
        r1.setStarost(24);

        System.out.printf("ime: %s, starost: %d, velikost: %d\n",
                r1.imeRastline, r1.getStarost(), r1.getVelikost());
    }

    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }
}
