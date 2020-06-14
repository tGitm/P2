package Kvizi;

public class izracunajRazliko {
    public static void main(String[] args) {
        System.out.println(izracunajRazliko("08:23:10", "10:10:05"));
    }

    public static String izracunajRazliko(String prviCas, String drugiCas) {
        String[] time1 = prviCas.split(":");
        String[] time2 = drugiCas.split(":");

        int casV_sek1 = Integer.parseInt(time1[0]) * 3600 + Integer.parseInt(time1[1]) * 60 + Integer.parseInt(time1[2]);
        int casV_sek2 = Integer.parseInt(time2[0]) * 3600 + Integer.parseInt(time2[1]) * 60 + Integer.parseInt(time2[2]);

        int izracunano = 0;
        if (casV_sek1 > casV_sek2) {
            izracunano = casV_sek1 - casV_sek2;
        }
        else {
            izracunano = casV_sek2 - casV_sek1;
        }

        int ure = izracunano / 60 / 60 % 60;
        int min = izracunano / 60 % 60;
        int sek = izracunano % 60;

        return String.format ("%02d:%02d:%02d", ure, min, sek);

    }
}
