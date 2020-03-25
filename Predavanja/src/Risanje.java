
import java.awt.Color;

/**
 *
 * @author Tim
 */
public class Risanje {

    static void izris3() {
        StdDraw.setScale(-100, 100);

        int[][] smeri = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        int trSmer = 0;

        int trDolzina = 5;
        int deltaDolzina = 2;

        int x = 0;
        int y = 0;

        for (int i = 0; i < 200; i++) {
            int nx = x + trDolzina * smeri[trSmer][0];
            int ny = y + trDolzina * smeri[trSmer][1];

            StdDraw.line(x, y, nx, ny);

            x = nx;
            y = ny;

            trSmer = (trSmer + 1) % 4;
            trDolzina += deltaDolzina;
        }
    }

    static void grafFunkcije() {
        final int H = 250;
        final int W = 800;

        int pi = -1;
        int pj = -1;

        StdDraw.setXscale(0, W - 1);
        StdDraw.setYscale(0, H - 1);

        StdDraw.setPenRadius(0.005);

        StdDraw.line(0, H / 2, W - 1, H / 2);
        StdDraw.line(W / 2, 0, W / 2, H - 1);

        double x1 = -2 * Math.PI;
        double x2 = 2 * Math.PI;
        double y1 = -1;
        double y2 = 1;

        for (int i = 0; i < W; i++) {
            double x = i * (x2 - x1) / (W - 1) + x1;
            double y = Math.sin(x);

            int j = (int) ((H - 1) * (y - y1) / (y2 - y1));

            if (j >= 0 && j < H) {
                if (pi == -1) {
                    StdDraw.line(i, H - j - 1, i, H - j - 1);
                } else {
                    StdDraw.line(pi, pj, i, H - j - 1);
                }
            }
        }

    }

    static void kazalec(double dolzina, double kot, double debelina) {
        double x = dolzina * Math.sin(2 * Math.PI * kot / 360);
        double y = dolzina * Math.cos(2 * Math.PI * kot / 360);

        StdDraw.setPenRadius(debelina);
        StdDraw.line(0, 0, x, y);

    }

    static void radar() {
        StdDraw.setScale(-100, 100);

        double kot = 0;
        for (;;) {
            StdDraw.clear(Color.black);

            StdDraw.setPenColor(Color.green);
            StdDraw.setPenRadius(0.01);

            for (int i = 0; i < 5; i++) {
                StdDraw.circle(0, 0, 20 * i);
            }

            kazalec(80, kot, 0.01);
            kot = kot + 10;

            StdDraw.show(100);
        }

    }
    
    static void spirala(){
        StdDraw.setScale(-100, 100);
        StdDraw.setPenRadius(0.01);
        
        double kot = 0;
        double deltaKot = 5;
        double d = 1;
        
        double px = 0;
        double py = 0;
        
        for (int i=0; i<300; i++){
            double x = d * Math.cos(2 * Math.PI * kot / 360);
            double y = d * Math.sin(2 * Math.PI * kot / 360);
            
            StdDraw.line(px, py, x, y);
            px = x;
            py = y;
            
            kot = kot + deltaKot;
            
            d = 1.01 * d;
        }
    }
    
    static void nRoza(int n){
        double trKot = 0;
        double deltaKot = 360/n;
        
        double x = 0;
        double y = 0;
    }

    public static void main(String[] args) {
        //izris3();
        //grafFunkcije();
        //radar();
        spirala();
    }
}
