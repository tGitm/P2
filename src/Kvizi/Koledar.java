package Kvizi;

import java.time.LocalDate;
import java.time.YearMonth;

public class Koledar {
    public static void main(String[] args) {
        izpisKoledarja(2019, 3);
    }

    public static void izpisKoledarja(int leto, int mesec) {
        String razmak = "";
        java.time.YearMonth yearMonth = java.time.YearMonth.of(leto, mesec);
        int steviloDni = yearMonth.lengthOfMonth();
        int prviDan    = java.time.LocalDate.of(leto, mesec, 01).getDayOfWeek().getValue();

        System.out.print("PO  TO  SR  ČE  PE  SO  NE");
        System.out.println();
        for (int i = 0; i < prviDan - 1; i++) {
            razmak = razmak + "    ";
        }
        System.out.print(razmak);

        int danVtednu = 1;
        while (danVtednu <= steviloDni) {
            String izpis = String.format("%2d  ", danVtednu);
            System.out.print(izpis);
            int dan = (prviDan + danVtednu - 1) % 7;
            if (dan % 7 == 0) {
                System.out.println();
            }
            danVtednu++;
        }
    }
}
