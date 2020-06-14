import java.awt.*;

public class DN06 {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            korona(30, Math.random() * (100 + 100) -100, Math.random() * (100 + 100) -100, Math.random() * (25 - 5) + 5);
        }
    }

    public static void korona(double dolzina, double x, double y, double velikost) {
        StdDraw.setScale(-100, 100);
        double kot = 0;

        int red = 255;
        for (int i = 0; i < 22; i++) {
            double x0 = x + dolzina * Math.sin(2 * Math.PI * kot / 360);
            double y0 = y + dolzina * Math.cos(2 * Math.PI * kot / 360);
            StdDraw.setPenColor(Color.black);
            StdDraw.setPenRadius(0.005);
            StdDraw.line(x, y, x0, y0);
            kot += 20;

            StdDraw.setPenColor(red, 0, 0);
            StdDraw.filledCircle(x, y, Math.random() * (25 - 5) + 5);
            red -= 5;
            velikost--;
        }
    }

}

