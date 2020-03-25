package predavanje4;

/**
 *
 * @author Tim
 */
public class vDvojisko {
    
    static String dvojisko(int x){
        String rezultat = "";
        while(x>0){
            if((x&1) == 1){
                rezultat = "1" + rezultat;
            }else{
                rezultat = "0" + rezultat;
            }
            x = x >> 1;
        }
        
        if (rezultat.isEmpty()){
            return "0";
        }
        else{
        return rezultat;
        }
    }
    
    static int vDesetisko(String x){
        int rezultat = 0;
        int bit = 1;
        
        for(int i=x.length()-1; i>=0; i++){
            if (x.charAt(i) == '1'){
                rezultat = rezultat + bit;
            }
            bit = bit << 1;//bit = bit * 2;
        }
        
        return rezultat;
    }
    
    public static void main(String[] args){
        int x = 42;
        String xPoDvojisko = dvojisko(x);
        System.out.println(vDesetisko(dvojisko(0)));
    }
}
