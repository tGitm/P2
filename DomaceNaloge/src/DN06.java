import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class DN06 {
     public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(new File(args[0]));
       String bes ="";
       String st=" ";
        while(sc.hasNext()){
            st = sc.nextLine();
            
            bes = bes+st;
         
        }
        sc.close();

        String koncna_beseda ="";
        
        for (int i=0; i<bes.length(); i+=8){
            String sub = bes.substring(i, i+8);
            int pret = Integer.parseInt(sub,2);
            char rez = (char) pret;
            koncna_beseda += rez;
        }
        
        
        System.out.println(koncna_beseda);

        }
}