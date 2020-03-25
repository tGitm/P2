/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje10;

import StdDraw;
import java.awt.Color;

/**
 *
 * @author Tim
 */
public class Krog extends Lik{
    int r;
    
    public Krog(int x, int y, int r, Color barva){
        super (x, y, barva);
        this.r = r;
    }
            
    void narisi(){
        StdDraw.setPenColor(this.getBarva);
        StdDraw.filledCircle(x, y, r);
    }
}
