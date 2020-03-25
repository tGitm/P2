
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class NekiZaForo {
    
    public static void analizirajTemperature(String t) throws Exception{
        Scanner sc = new Scanner(new File(t));  
        double [] tab = new double [15];
          int i=0;  
        
        
        
        while (sc.hasNext()){
           String vsebina = sc.next();
            double vsb = Double.parseDouble(vsebina);
            tab[i]=vsb;
           i++;
            
                
        }
        sc.close();
              
            for (int k=0; k<tab.length; k++){
                System.out.println(tab[k]);
            }
    
    }
    
    public static void main(String[] args) throws Exception{
//        if (args.length == 1){
//            //System.out.print(args[0]);
//            
//           // String a = args[0];
//            analizirajTemperature(args[0]);
//        }
       analizirajTemperature("viri/fri.dat");
        /*}else if (args.length >1){
            String b = args[0];
            
        }*/
        }
    
}
