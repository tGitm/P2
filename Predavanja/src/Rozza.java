
import java.awt.Color;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tim
 */
public class Rozza {
    
    public static void narisi(double x, double y, Color b, double v){
        double r1 = v / 8;
        double r2 = v / 5;
        
        StdDraw.setPenColor(Color.green);
        StdDraw.setPenRadius(0.01);
        StdDraw.line(x, y , x, y + v);
        StdDraw.setPenRadius();
        
        StdDraw.setPenColor(b);
        StdDraw.filledCircle(x+r1/2+r2, y+v, r2);
        StdDraw.filledCircle(x-r1/2-r2, y+v, r2);
        StdDraw.filledCircle(x, y+v+r1/2+r2, r2);
        StdDraw.filledCircle(x, y+v-r1/2-r2, r2);
        
        StdDraw.setPenColor(Color.green);
        StdDraw.filledCircle(x, y+v, r1);
        
    }
    
    public static void main(String[] args){
        final int N = 200;
        Random rnd = new Random();
        
        for (int i = 0; i < N; i++){
            double x = rnd.nextDouble();
            double y = rnd.nextDouble();
            double r = rnd.nextDouble()/2;
            
            Color c = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            
            narisi(x, y, c, r);
        }
    }
}
