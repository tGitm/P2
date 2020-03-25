
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Tim
 */
public class DN04 {
    
    static String[] prva   = {"Miha", "Micka", "Tone", "Lojze", "Mojca", "Pepca", "Franci", "Francka"};
    static String[] druga  = {"Vozi", "Seka", "Potrebuje", "Gleda", "Barva", "Voha", "Lomi", "Popravlja"};
    static String[] tretja = {"Kolo", "Avto", "Likalnik", "Sonce", "Vrtnico", "Drevo", "Lopato", "Sekiro"};

    static String ustvariGeslo() {
    Random rnd = new Random();
    int rnd1 = rnd.nextInt(prva.length);
    int rnd2 = rnd.nextInt(druga.length);
    int rnd3 = rnd.nextInt(tretja.length);
    
    return prva[rnd1] + druga[rnd2] + tretja[rnd3];
  }

    public static void main(String[] args) {
     
        ustvariGeslo();
        
        
        List<String> pr = Arrays.asList(prva);
        List<String> dr = Arrays.asList(druga); 
        List<String> tr = Arrays.asList(tretja);
        
        String[] splittan = args[0].split("(?=\\p{Upper})");
        
        if (splittan.length < 3){
            System.out.println("false");
            
        }else{
       
            if (pr.contains(splittan[0])){
                if (dr.contains(splittan[1])){
                    if (tr.contains(splittan[2])){
                        System.out.println("true");
                    }    
                }
                    else{
                        System.out.println("false"); 
                        }
            }
            
                
                    else{
                        System.out.println("false"); 
                        }
                    
               
            
            
            
            }
    }
}
