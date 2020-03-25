
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class Radar {
    
    static void kazalec(double dolzina, double kot, double debelina){
        double x = dolzina * Math.sin(2 * Math.PI * kot / 360);
        double y = dolzina * Math.cos(2 * Math.PI * kot / 360);
        
        StdDraw.setPenRadius(debelina);
        StdDraw.line(0, 0, x, y);
    }
    
    public static void main(String[] args){
        StdDraw.setScale(-100, 100);
        
        double kot = 0;
        
        for(;;){
            StdDraw.clear(Color.black);
            
            StdDraw.setPenColor(Color.green);
            StdDraw.setPenRadius(0.01);
            
            for (int i = 0; i < 10; i++){
                StdDraw.circle(0, 0, 20 * i);
            }
            
            kazalec(80, kot, 0.01);
            kot = kot + 10;
            StdDraw.show(100);
        }
    }
}
