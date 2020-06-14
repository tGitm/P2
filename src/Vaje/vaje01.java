package Vaje;

public class vaje01 {

    public static void main(String[] args) {
        pravokotnik(2, 5, 15);
        trikotnik(1, 5);
        trikotnikV(1, 5);
        romb(1, 5);
        rombPrazen(1, 5);
        //kvadratX();

    }

    static void pravokotnik(int odmik, int visina, int sirina) {
        for (int i = 0; i < visina; i++) {
            for (int j = 0; j < odmik; j++) {
                System.out.println();
            }
            for (int j = 0; j < sirina; j++) {
                System.out.print("# ");
            }
        }
        System.out.println("\n");
    }

    static void trikotnik(int odmik, int visina) {
        for (int k = 0; k < visina; k++) {
            for (int i = 0; i < odmik; i++) {
                System.out.print("  ");
            }
            for (int j = 0; j < visina - k - 1; j++) {
                System.out.print("  ");
            }
            for (int z = 0; z < 2 * k + 1; z++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    static void trikotnikV(int odmik, int visina) {
        for (int k = visina-1; k >= 0; k--) {
            for (int i = 0; i < odmik; i++) {
                System.out.print("  ");
            }
            for (int j = 0; j < visina - k - 1; j++) {
                System.out.print("  ");
            }
            for (int z = 0; z < 2 * k + 1; z++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    static void romb(int odmik, int velikost) {
        System.out.println();
        trikotnik(odmik, velikost);
        trikotnikV(odmik + 1, velikost - 1);
        System.out.println();
    }

    static void rombPrazen(int odmik, int velikost){
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < odmik; j++) {
                System.out.print("");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                if (j > velikost + i) {
                    System.out.print("");
                }
                else {
                    System.out.print("# ");
                }
            }

        }
    }

    static void kvadratX(int odmik, int velikost) {
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < odmik; j++) {
                System.out.print("");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                if (j < velikost + 1) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("");
                }
            }

        }
    }

}

