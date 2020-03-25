package vaje4;

/**
 *
 * @author Tim
 */
public class Crke {
    
  /*  public static void izpisi(long crka){
        long bit=1;
        for (int i=63; i>=0; i--){
            long rez = (crka&(bit<<i));
            if (rez==0){
                System.out.print(" ");
                
            }else{
                System.out.print("*");
                }
            
            if (i%8==0){
                System.out.println();
                }
        }=7; i>=0; i--){
            for (int j=7; j>=0; j--){
                for (int k=0; k<crke.length; k++){
                    long crka = crke[k];
                    long rez = (crka&(bit<<i));
                    if (rez==0){
                        System.out.print(" ");
                
                    }else{
                        System.out.print("*");
                    }
                }System.out.println();
      
    }*/
    
    public static void izpisi(long crke[]){
        long bit=1;
        
        for (int i=7; i>=0; i--){
        for (int k=0; k<crke.length; k++){
                long crka = crke[k];
                for (int j=7; j>=0; j--){
                    long rez = (crka&(bit<<i));
                    if (rez==0){
                        System.out.print(" ");
                
                    }else{
                        System.out.print("*");
                    }
                }System.out.println();
                
        }
        }
    }
            
        
    public static void main(String[] args){
        izpisi(new long[] {

    4821103401091611672l, 0, 144680345680364600l, 1739555224076567106l, 

    -9114862049243683816l,1739555224076567106l, 0, 4821103401091611672l

    });
        //izpisi(4342175383962075708l);
        
        /*int a = 122;
        System.out.println(Integer.toBinaryString(a));
        
        int b=a&8;
        System.out.println(Integer.toBinaryString(b));
        
        int bit=1;
        for (int i=0; i<8; i++){
            System.out.println(Integer.toBinaryString(a&bit));
            bit*=2;
        */    
        }
    }

