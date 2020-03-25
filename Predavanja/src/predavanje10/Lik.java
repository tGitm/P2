
package predavanje10;
import java.awt.Color;

/**
 *
 * @author Tim
 */
abstract public class Lik {
    private int x;
    private int y;
    private Color barva;
    
    public Lik(int x, int y, Color barva){
        this.x = x;
        this.y = y;
        this.barva = barva;
    }
    
    abstract void narisi();

    void premakni(int deltaX, int deltaY){
        this.x = deltaX;
        this.y = deltaY;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getBarva() {
        return barva;
    }
    
}
    

