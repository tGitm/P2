package Vaje;

public class Racun {
    private double stanje;
    private final int stevilka;

    Racun(int a) {
        this.stanje=0.0;
        this.stevilka=a;
    }

    public void polog(double znesek) {
        if (znesek>0)
            stanje+=znesek;
        else
            System.err.println("Racun.polog(...): "
                    +"ne morete poloziti negativnega zneska.");
    }

    public void dvig(double znesek) {
        if (znesek>0)
            stanje-=znesek;
        else
            System.err.println("Racun.dvig(...): "
                    +"ne morete dvigniti negativnega zneska.");
    }

    public double dobiStanje() {
        return stanje;
    }

    public int dobiStevilkoRacuna() {
        return stevilka;
    }

    public String toString(){
        return "St. " + stevilka + ": " + "stanje = " + stanje;
    }
}
