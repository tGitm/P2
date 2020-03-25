/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje10;

/**
 *
 * @author Tim
 */
public class Pravokotnik extends Lik{
    int a;
    int b;
    
    Pravokotnik(int x, int y, int a, int b, Color barva){
        super(x, y, barva);
        this.b = b;
        this.a = a;
    }
    
    void narisi(){
        StdDraw.setPenColor(getBarva());
        StdDraw.filledRectangle(getX(), getY(), );
    }
}
