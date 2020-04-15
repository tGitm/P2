package Predavanja.Classi2;

import Predavanja.Classi1.Rastlina;

public class RastlinaKonstruktor {
    //atributi
    static int ID; //stevilo do sedaj narejenih rastlin
    int id; //oznaka
    private int velikost;
    private int starost;
    String imeRastline;

    int rastMladaRastlina = 5;
    int rastStaraRastlina = 2;

    RastlinaKonstruktor() {
        this.ID++;
        this.id = ID;
        this.imeRastline = "";
        this.velikost = 0;
    }

    RastlinaKonstruktor(String imeRastline) {
        this();
        this.imeRastline = imeRastline;
    }

    RastlinaKonstruktor (int starost, int velikost) {
        this("Rastlina ime");
        this.starost = starost;
        this.velikost = velikost;

    }

    public int getStarost() {
        return starost;
    }
    public void setStarost(int starost) {
        this.starost = starost;
        this.velikost = starost / 5;
    }

    public int getVelikost() {
        return velikost;
    }

    public void setVelikost(int velikost) {
        this.velikost = velikost;
    }

    int mesecnaRast() {
        if (starost <= 6)
            return this.rastMladaRastlina;
        else
            return this.rastStaraRastlina;
    }

    void novMesec() {
        this.starost += 1;
        this.velikost += mesecnaRast();
    }

    void izrisiSe() {
        System.out.printf("Ime rastline: %s, starost: %d, velikost: %d\n", this.imeRastline, this.starost, this.velikost);
        for (int i = 0; i < velikost; i++) {
            System.out.println(".");
        }
    }

    void spremeniIme(String novoIme) {
        this.imeRastline = novoIme;
    }

    static void izpisiNavodilaZaObrezovanje() {
        System.out.println("Rastline obrezujemo dvakrat letno, spomladi in jeseni ...");
    }

    void spremeniImeRastline(String imeRastline) {
        this.imeRastline = imeRastline;
    }

    public String toString() {
        return "Rastlina: " + imeRastline;
    }
}
