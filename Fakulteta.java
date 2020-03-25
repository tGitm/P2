public class Fakulteta {


    public static double fakultetaD(int n) {
        double fac = 1;

        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static double stirlingD(int n) {
        double stir = Math.sqrt(2 * Math.PI * n) * Math.pow(n / Math.E, n);

        return stir;
    }

    public static void izpis() {
        System.out.printf("%3s %13s %25s %18s \n", "n", "n!", "Stirling(n)", "napaka (%)");
        System.out.println("--------------------------------------------------------------");

        for (int i = 1; i <= 100; i++) {
            double fac = fakultetaD(i);
            double stir = stirlingD(i);
            double napaka = ((fac - stir)/fac) * 100.0;

            System.out.printf("%3d %20.9E %20.9E %15.7f \n", i, fac, stir, napaka);
        }
    }



    public static void main(String[] args) {
       izpis();


    }

}