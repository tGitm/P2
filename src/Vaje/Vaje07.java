package Vaje;

import java.util.Random;

public class Vaje07 {
    public static void main(String[] args) {
        Banka banka = new Banka();
        Random random = new Random();
        int st;
        for (int i=0; i<10; i++){
            st = random.nextInt(100000);
            if(random.nextBoolean()){
                banka.dodajTekociRacun(st, random.nextDouble()*100);
            } else {
                banka.dodajVarcevalniRacun(st, random.nextDouble()*0.1);
            }
            if(random.nextBoolean()){
                banka.polog(st, random.nextDouble()*100);
            } else {
                banka.dvig(st, random.nextDouble()*100);
            }
        }
        banka.izpisiTekoceRacune();
        banka.izpisiVarcevalneRacune();
        banka.dodajObresti();
        banka.dodajObresti();
        banka.dodajObresti();
        banka.izpisiVarcevalneRacune();
    }
}


class Banka {
    private Racun[] racuni = new Racun[100];
    private int nrac = 0;

    public void dodajTekociRacun(int a, double limit) {
        this.racuni[nrac] = new TekociRacun(a,limit);
        nrac++;
    }

    public void dodajVarcevalniRacun(int a, double obresti) {
        this.racuni[nrac] = new VarcevalniRacun(a,obresti);
        nrac++;
    }

    public void dodajObresti(){
        for (int i=0; i<nrac; i++ ){
            Racun rac = racuni[i];
            if (rac instanceof VarcevalniRacun){
                ((VarcevalniRacun) rac).dodajObresti();
            }
        }
    }

    public void polog(int a, double znesek) {
        int st;
        Racun rac;
        for (int i=0; i<nrac; i++) {
            rac = racuni[i];
            st = rac.dobiStevilkoRacuna();
            if (st == a) {
                rac.polog(znesek);
            }
        }
    }

    public void dvig(int a, double znesek) {
        int st;
        Racun rac;
        for (int i=0; i<nrac; i++) {
            rac = racuni[i];
            st = rac.dobiStevilkoRacuna();
            if (st == a) {
                rac.dvig(znesek);
            }
        }
    }

    public void izpisiVarcevalneRacune() {
        Racun rac;
        System.out.println("Varcevalni racuni");
        for (int i=0; i<nrac; i++) {
            rac = racuni[i];

            if (rac instanceof VarcevalniRacun) {
                System.out.println(rac);
            }
        }
    }

    public void izpisiTekoceRacune() {
        Racun rac;
        System.out.println("Tekoci racuni");
        for (int i=0; i<nrac; i++) {
            rac = racuni[i];

            if (rac instanceof TekociRacun) {
                System.out.println(rac);
            }
        }
    }
}

class VarcevalniRacun extends Racun {
    private double obresti;
    VarcevalniRacun(int a, double obresti){
        super(a);
        this.obresti = obresti;
    }

    public void dodajObresti(){
        double ts = this.dobiStanje();
        if (ts>0) {
            this.polog(obresti * ts);
        } else {
            this.dvig(-obresti*ts);
        }
    }

    public String toString(){
        return "Varcevalni racun St. " + this.dobiStevilkoRacuna() + ": " + "stanje = " + this.dobiStanje() +
                ": obrestna mera = " + this.obresti;
    }
}

class TekociRacun extends Racun {
    private double limit;
    TekociRacun(int a, double limit){
        super(a);
        this.limit = limit;
    }

    public void dvig(double znesek) {
        if (znesek<limit){
            super.dvig(znesek);
        } else {
            System.err.println("TekociRacun.dvig(...): presegli ste limit.");
        }
    }

    public String toString(){
        return "Tekoci racun St. " + this.dobiStevilkoRacuna() + ": " + "stanje = " + this.dobiStanje() +
                ": limit = " + this.limit;
    }
}