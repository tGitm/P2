import java.awt.Color;

public class StdDraw_stolpci {
    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        narisiStolpce(new int[]{10, 5, 8, 4, 12, 7, 4}); //tabela velikosti je že podana v navodilih
    }

    public static void narisiStolpce(int[] visine) {
        //grem čez tabelo višin da najdem največjo podano višino
        int najVis = 0;
        for (int i = 0; i < visine.length; i++) {
            if (visine[i] > najVis) {
                najVis = visine[i];
            }
        }

        double maxVis = 0.95 / najVis;
        double sirina = 1.0 / (visine.length + 1);
        double razmakMed = sirina / (visine.length + 1);

        StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);

        Color[] barve = new Color[]{Color.red, Color.green, Color.blue};
        int barva = 0;
        for (int i = 0; i < visine.length; i++) {
            double visinaStolpca = visine[i] * maxVis;
            StdDraw.setPenColor(barve[barva]);
            barva = (barva + 1) % 3;
            StdDraw.filledRectangle((i + 0.5) * sirina + (i + 1) * razmakMed,
                    visinaStolpca / 2, sirina / 2, visinaStolpca / 2);


        }
    }
}
