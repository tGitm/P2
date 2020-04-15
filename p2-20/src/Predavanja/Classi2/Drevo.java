package Predavanja.Classi2;

public class Drevo extends RastlinaKonstruktor {
    //vse enako kot v Rastlina();
    //razen tisto, kar bomo spremenili v tem razredu
    int sirina = 5;

    int mesecnaRast() {
        if (getStarost() < 24)
            return 5;
        else
            return 1;

    }
    void novMesec() {
        super.novMesec();
        sirina += 5;
    }

    public String toString() {
        return("Drevo: " +  imeRastline);
    }
}
