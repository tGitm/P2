import java.awt.Color;
import java.util.Random;

public class Risanje {

    public static void main(String[] args) {

        /*
        String [] tabelabarv = {"modra", "cyan", "zelena", "magenta", "oranzna", "roza", "rdeca"};

        for(int i = 0; i<40;i++){
            Random rand = new Random();
            int x = rand.nextInt(200)-100;

            int y = rand.nextInt(200)-100;
            int b = rand.nextInt(7);
            int v = rand.nextInt(8)+1;
            narisi(x,y,tabelabarv[b],v);
        }
        */

        //risanje1();
        spirala();
        //radar();
        //while(true) {spiralaTrash();}



    }


    static void risanje1(){

        StdDraw.setScale(-100, 100);
        int x = 0;
        int y = 0;
        int r = 255;
        int g = 255;
        int b = 255;
        Random rand = new Random();

        while(1<2){
            for(int radij = 50;radij>0;radij-=10){
                r = rand.nextInt(230)+21;
                g = rand.nextInt(180)+21;
                b = rand.nextInt(190)+21;
                if(radij>15){
                    r*=0.3;
                    g*=0.3;
                    b*=0.3;
                }

                int pen = rand.nextInt(10);
                double pend = pen/1000.0;   //med 0.010 in 0.001
                StdDraw.setPenColor(r,g,b);
                StdDraw.setPenRadius(pend);
                StdDraw.circle(x,y,radij);

            }
        }

        //StdDraw.clear();
    }


    static void spiralaKvadratna(){
        StdDraw.clear(Color.black);
        StdDraw.setCanvasSize(500,500);
        StdDraw.setScale(-100,100);
        StdDraw.clear(Color.lightGray);
        StdDraw.setPenColor(Color.white);
        int[][] smeri = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

        while(true){
            int z = 1;
            int smeriIndeks = 0;
            int x0,y0,x1,y1;
            x0 = y0 = x1 = y1 = 0;

            for(int i = 0;i<100;i++){
                x1 = x0+z*smeri[smeriIndeks][0];
                y1 = y0+z*smeri[smeriIndeks][1];
                StdDraw.line(x0,y0,x1,y1);
                x0 = x1;
                y0 = y1;
                smeriIndeks = (smeriIndeks + 1) % 4;
                z++;
            }
            Random rand = new Random();
            StdDraw.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
            StdDraw.clear(Color.lightGray);
        }
    }

    static void spirala() {
        StdDraw.setScale(-100, 100);
        StdDraw.setPenRadius(0.001);

        double [][] cilji = new double [9][2];
        int ciljIndex = 0;

        double kot = 0;
        double deltaKot = 10;

        double d = 1;
        double px = 0;
        double py = 0;
        double x = 0;
        double y = 0;
        int g = 1;


        for (int i = 0; i < 300; i++) {

            if(i%Math.round(g)==0){
                x = d * Math.cos(2 * Math.PI * kot / 360);
                y = d * Math.sin(2 * Math.PI * kot / 360);
                StdDraw.line(px, py, x, y);
                g+=Math.PI*1.5;

                //v tabeli cilji hranim zadnjih 9 koordinat (za une crte ven)
                cilji[ciljIndex][0] = x;
                cilji[ciljIndex][1] = y;
                ciljIndex = (ciljIndex+1) % 9;

                //namest te tabele lah sm to spodi klices skos ampak bo weird zgledal ker vec crt potegne iz sredine
                // StdDraw.line(0, 0, x, y);
            }

            px = x;
            py = y;

            kot = kot + deltaKot;
            d = d + 0.2;
        }

                //risanje crt is sredisca
        for(int i = 0; i<cilji.length; i++){
            x = cilji[i][0];
            y = cilji[i][1];
            StdDraw.line(0, 0, x, y);
        }

    }


    static void radar() {
        StdDraw.setScale(-100, 100);
        double kot = 0;



        for (;;) {
            StdDraw.setPenColor(Color.green);
            StdDraw.setPenRadius(0.01);
            for (int i = 0; i < 5; i++) {
                StdDraw.circle(0, 0, 20 * i);
            }
            double x = 80 * Math.sin(Math.PI * kot/360);
            double y = 80 * Math.cos(Math.PI * kot/360);
            StdDraw.line(0, 0, x, y);
            kot+=10;
            StdDraw.clear(Color.black);
        }
    }

    static void spirala1() {
        StdDraw.setScale(-100, 100);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(Color.white);

        double kot = 0;
        double distance = 1;
        double x0 = 0;
        double y0 = 0;

        for (int i = 0; i < 500; i++) {
            StdDraw.clear(Color.BLACK);
            double x1 = distance * Math.cos(Math.PI * kot/360);
            double y1 = distance * Math.sin(Math.PI * kot/360);
            StdDraw.line(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
            kot+=100;
            distance+=0.2;
        }

        for (int i = 500; i >= 0; i--) {
            double x1 = distance * Math.cos(Math.PI * kot / 360);
            double y1 = distance * Math.sin(Math.PI * kot / 360);
            StdDraw.setPenColor(Color.black);
            StdDraw.line(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
            kot-=100;

            distance-=0.2;
        }
    }










}

