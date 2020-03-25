class Figura {

    public Figura[][] sahovnica; // sahovnica, na kateri se figura nahaja
    public int barva;            // crna ali bela
    public int x, y;             // koordinati figure na sahovnici (od 1 do 8)

    // POZOR: za lazjo predstavitev figure sta koordinati x in y podani
    // s števili med 1 in 8 (in ne med 0 in 7). Zato je, na primer, figura
    // s koordinatami (4,6) v sahovski deski zapisana v polju sahovnica[3][5].

    public Figura(Figura[][] sahovnica, int barva, int x, int y) {
        this.sahovnica = sahovnica;
        this.barva = barva;
        this.x = x;
        this.y = y;
    }

    public boolean seLahkoPremakne(int noviX, int noviY) {
        // preveri, ali se polje nahaja na sahovnici
        if (noviX > 8 || noviX < 1 || noviY > 8 || noviY < 1) {
            return false;
        }
        // preveri, ali je polje ze zasedeno s figuro iste barve
        if (sahovnica[noviX - 1][noviY - 1] != null
                && sahovnica[noviX - 1][noviY - 1].barva == this.barva) {
            return false;
        }
        return true;
    }
}


// TODO ... napiši razred Trdnjava
class Trdnjava extends Figura {

    Trdnjava(Figura[][] sahovnica, int barva, int x, int y) {
        super(sahovnica, barva, x, y);
    }

    @Override
    public boolean seLahkoPremakne(int noviX, int noviY) {
        if (super.seLahkoPremakne(noviX, noviY) == false) {
            return false;
        }

        //premik vodoravno ali navpično
        if (!(x == noviX && Math.abs(y - noviY) > 0) && !(y == noviY && Math.abs(x - noviX) > 0)) {
            return false;
        }

        //ali katero od polj zaseda druga figura
        if (x == noviX) {    //vodoravni premik
            int zacetek = y > noviY ? noviY : y;
            int konec = zacetek + Math.abs(y - noviY);

            for (int i = zacetek + 1; i < konec; i++) {
                if (sahovnica[x - 1][i - 1] != null) {
                    return false;
                }
            }
        } else {   //navpični premik
            int zacetek = x > noviX ? noviX : x;
            int konec = zacetek + Math.abs(y - noviY);

            for (int k = zacetek + 1; k < konec; k++) {
                if (sahovnica[x - 1][k - 1] != null) {
                    return false;

                }
            }

        }
        return true;
    }


    public class Naloga11 {

        private Figura[][] sahovnica = new Figura[8][8];

        private void izpis() {
            System.out.printf("  1 2 3 4 5 6 7 8\n");
            for (int i = 0; i < sahovnica.length; i++) {
                System.out.printf("%d ", i + 1);
                for (int j = 0; j < sahovnica[i].length; j++) {
                    System.out.printf("%s ", sahovnica[i][j] == null ? "." : (sahovnica[i][j].barva == 0 ? "T" : "t"));
                }
                System.out.println();
            }
        }

        void preveri(boolean test, boolean expected, String msg) {
            System.out.printf("%s - %s\n", (test == expected ? "OK " : "NOK"), msg);
        }

        public void main(String[] args) {
            Naloga11 igra = new Naloga11();
            igra.sahovnica[0][0] = new Trdnjava(igra.sahovnica, 0, 1, 1); // črna trdnjava na 1,1
            igra.sahovnica[0][3] = new Trdnjava(igra.sahovnica, 0, 1, 4); // črna trdnjava na 1,4
            igra.sahovnica[5][3] = new Trdnjava(igra.sahovnica, 1, 6, 4); // bela trdnjava na 6,4
            igra.izpis();
            // preverim različne kombinacije premikov in postavitve; ob pravilno napisani
            // metodi seLahkoPremakne(), morajo vsi spodnji testi izpisati OK
            preveri(igra.sahovnica[0][3].seLahkoPremakne(1, 8), true, "vodoravni premik");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(4, 1), true, "navpični premik");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(1, 1), false, "ni premika");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(3, 3), false, "nedovoljen premik");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(1, 4), false, "figura iste barve je na ciljni poziciji");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(6, 4), false, "nedovoljen premik");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(1, 9), false, "cilj je izven sahovnice");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(0, 1), false, "cilj je izven sahovnice");
            preveri(igra.sahovnica[0][0].seLahkoPremakne(1, 7), false, "figura iste barve je na poti");
            preveri(igra.sahovnica[0][3].seLahkoPremakne(6, 4), true, "figura druge barve je na cilju");
            preveri(igra.sahovnica[0][3].seLahkoPremakne(7, 4), false, "figura druge barve je na poti");
            preveri(igra.sahovnica[5][3].seLahkoPremakne(6, 8), true, "premik na rob sahovnice desno");
            preveri(igra.sahovnica[5][3].seLahkoPremakne(6, 1), true, "premik na rob sahovnice levo");
            preveri(igra.sahovnica[5][3].seLahkoPremakne(1, 4), true, "premik na rob sahovnice gor - polje zasedeno s figuro druge barve");
            preveri(igra.sahovnica[5][3].seLahkoPremakne(8, 4), true, "premik na rob sahovnice dol");
        }
    }
}
