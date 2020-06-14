package Izpit2020;

public class Naloga14 {
    static char [][] krizanka = {
            {'D', 'F', 'T', 'O', 'P'},
            {'L', 'I', 'P', 'A', 'M'},
            {'C', 'K', 'O', 'L', 'T'},
            {'F', 'E', 'S', 'G', 'T'},
            {'S', 'S', 'M', 'E', 'T'}
    };

    static String [] besede =
            {"LOPAR","SONCE","KOL","KOLO","TOP","LIPA","SMET","ORODJE"};

    public static Lokacija poisciNajdaljso(char [][] krizanka, String [] besede) {
        Lokacija lokacija = new Lokacija();
        int najd = 0;
        for (int i = 0; i < krizanka.length; i++) {
            for (int j = 0; j < krizanka[i].length; j++) {
                if (besede.equals(i)) {

                }
            }

        }

        return lokacija;
    }

    public static void main(String[] args) {
        System.out.printf(
                "Prva najdaljša beseda se nahaja na lokaciji %s\n",
                poisciNajdaljso(krizanka, besede)
        );
    }
}

class Lokacija {
    private String vrstica;
    private int stolpec;

    void Lokacija(String vrstica, int stolpec) {
        this.vrstica = vrstica;
        this.stolpec = stolpec;
    }

    public String getVrstica() {
        return vrstica;
    }

    public int getStolpec() {
        return stolpec;
    }

    public void setVrstica(String vrstica) {
        this.vrstica = vrstica;
    }

    public void setStolpec(int stolpec) {
        this.stolpec = stolpec;
    }

    public String toString() {
        return String.format("(%s,%d)", this.vrstica, this.stolpec);
    }
}