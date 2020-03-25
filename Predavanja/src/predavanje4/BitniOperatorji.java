package predavanje4;

/**
 *
 * @author Tim
 */
public class BitniOperatorji {
    
    static int steviloBitov(int x){
        int stevilo_bitov = 0;
        
        while(x > 0){
            if ((x&1) == 1){
                stevilo_bitov++;
            }
            x = x >> 1;
        }
        return stevilo_bitov;
    }
    
    static int steviloBitov2(int x){
        int stevilo_bitov = 0;
        int bit = 1;
        while(bit < Math.pow(2, 31)){
            if ((x&bit)== bit){
                stevilo_bitov++;
            }
            bit = bit << 1;
        }
        return stevilo_bitov;
    }
    
    public static void main(String[] args){
        int x = 42;
        System.out.printf("Stevilo prizganih bitov v %d je %d\n", x, steviloBitov(x));
        System.out.printf("Stevilo prizganih bitov v %d je %d\n", x, steviloBitov2(x));
    }
}
