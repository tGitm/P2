package predavanje3;

import java.util.Random;

/**
 *
 * @author Tim
 */
public class Rnd {
    
    /*
    [3,7]=>interval 3-7
    nextInt(b-a +1) + a   
    */
    
    
    public static void main(String[] args){
        Random rnd = new Random();  //če dam neko cifro v (npr. 0) pol bo isto zaporedje skos
        for (int i=1; i<=7;i++){
            int stevilo = rnd.nextInt(39)+1;
            System.out.print(stevilo + " ");
        }
        
        System.out.println();
        
        //stevilo na intervali od [a,b];
        int a = 3;
        int b = 7;
        
        int x = a + rnd.nextInt(b-a +1) +a;
        System.out.println(x);
            
    }
}
