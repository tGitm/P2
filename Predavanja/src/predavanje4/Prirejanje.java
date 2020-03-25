package predavanje4;

/**
 *
 * @author Tim
 */
public class Prirejanje {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        
        System.out.println(a == b);
        System.out.println(a = b);
        
        int c = a= b;
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
