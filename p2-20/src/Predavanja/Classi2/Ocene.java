package Predavanja.Classi2;

public class Ocene {
    private int [] ocene;
    private int steviloOcen;

    private String status; //status studenta (Odlične / Dober)

    Ocene () {
        this.ocene = new int[100];
        this.steviloOcen = 0;
        this.status = "?";
    }

    public int[] getOcene() {
        return ocene;
    }

    public int getSteviloOcen() {
        return steviloOcen;
    }

    public String getStatus() {
        return status;
    }

    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }

    public void setSteviloOcen(int steviloOcen) {
        this.steviloOcen = steviloOcen;
    }

    private void osveziStatus() {
        int vsota = 0;
        for (int i = 0; i < steviloOcen; i++) {
            vsota += ocene[i];
        }
        double povprecje = (steviloOcen != 0 ? 1.0 * vsota / steviloOcen : 0);
        status = povprecje >= 9 ? "Odličen" : "Dober";
    }

    public void dodajOceno(int ocena) {
        ocene[steviloOcen++] = ocena;
        osveziStatus();
    }
}
