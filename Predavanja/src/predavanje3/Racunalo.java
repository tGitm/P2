
package predavanje3;

/**
 *
 * @author Tim
 */
public class Racunalo {
    
    public static void main(String[] args){
        System.out.println(args[0] + "+" +args[1] + "=" + args[0] + args[1]);
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println(args[0] + "+" + args[1] + "=" + (a+b));
        
        System.out.printf("%s + %s = %d\n", args[0], args[1], a+b);
    }
}
