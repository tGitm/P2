
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Tim
 */

public class DN07 {

    static void narisi(int x, int y, int v, Color b){
        StdDraw.setScale(-100, 100);

        StdDraw.setPenColor(Color.green);
        

        StdDraw.setPenColor(b);    
        StdDraw.filledCircle(x+v, y, v);
        StdDraw.filledCircle(x-v, y, v);
        StdDraw.filledCircle(x, y+v, v);
        StdDraw.filledCircle(x, y-v, v);
        

        
        StdDraw.line(x, y, x, y-10*v);
        StdDraw.setPenColor(Color.red);
        StdDraw.filledCircle(x, y, v/2);
    }
    
    public static void main(String[] args){
        //StdDraw.setScale(-100, 100);
        Random rozaLd = new Random();
        int x = rozaLd.nextInt(50 - (-50)) - (50);

        Random rozaS = new Random();
        int v = rozaS.nextInt(30 - 15 + 15);

        Random rozaGd = new Random();
        int y = rozaGd.nextInt(50 - (-50)) - (50);


        Color b = new Color((int)(Math.random() * 0x1000000)); 

        narisi(x,y,v,b);

    }
}
