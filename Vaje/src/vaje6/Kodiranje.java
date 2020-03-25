package vaje6;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Kodiranje {
    
    static void odkodiraj(String besedilo, String koda) throws Exception{
        //branje prve datoteke
        Scanner sc = new Scanner(new File(besedilo));
        
        int stevec = 0;
        String [] prebrano = new String [100];
        while(sc.hasNext()){
            String vsebina = sc.next();
            prebrano[stevec] = vsebina;
            stevec ++;
            
        }

        //branje druge datoteke
        Scanner sc2 = new Scanner(new File(koda));
        
        while(sc2.hasNextInt()){
         //   int vsb = sc2.nextInt();
            
            int vs1, vs2, z = 0;
            if ((vs1 = sc2.nextInt()) == 0){
                z++;
                continue;
            }
            vs2 = sc2.nextInt();
           
            if (z==3) System.out.printf("%c\n", prebrano[vs1-1].charAt(vs2-1));  
            else if (z==2) System.out.printf("%c ", prebrano[vs1-1].charAt(vs2-1));  
            else if (z==1){
              //  System.out.printf("%c", prebrano[vs1-1].charAt(vs2-1).toUpperCase());  
            }else{
                System.out.printf("%c", prebrano[vs1-1].charAt(vs2-1));  
            }
            
            
           /* if (vs1<=stevec && vs2<=prebrano[vs1-1].length()){
                System.out.printf("%c", prebrano[vs1-1].charAt(vs2-1));   
            
            }else{
                System.out.println("?");
                
            }*/
        }
         sc2.close();
    }
    
    public static void main(String[] args) throws Exception{
        odkodiraj("viri/pesem.txt", "viri/kodirano.txt");

    }
}
