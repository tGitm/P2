package predavanje6;

import java.util.Random;

/**
 *
 * @author Tim
 */
public class UkazSwitch {
    
    public static void main(String[] args){
    int ocena = 7;
    
        switch (ocena){
        case 10: System.out.println("Odlično");
            break;
        case 9:
        case 8:
            System.out.println("Prav dobro");
            break;
        
        case 7: System.out.println("Dobro");
            break;
        case 6: System.out.println("Zadostno");
        default: System.out.println("Nezadostno");
    
        }
    }
    Random rnd = new Random(10);
}
