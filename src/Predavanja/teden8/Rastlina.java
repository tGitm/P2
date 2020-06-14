package Predavanja.teden8;

public class Rastlina {
    //atributi
    static int ID; //stevilo do sedaj narejenih rastlin
    int id; //oznaka
    int velikost;
    int starost;
    String imeRastline;

    int rastMladaRastlina = 5;
    int rastStaraRastlina = 2;

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
}
