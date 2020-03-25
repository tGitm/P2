
import java.util.Locale; 
/**
 *
 * @author Tim
 */
public class DN03 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.ENGLISH);
        
            if (args[0].equals("min")){
                int x = 1;
                String argument = "";
                
                while(x<args.length){
                    argument = argument + args[x] + " ";
                    x += 1;
                }
                int ind = 0;
                double min = 0;
                double newmin=999999;
                double newargument;

                    ind ++;
                    
                for(int j=1; j<args.length; j++){
                    newargument = Double.parseDouble(args[j]);
                    if(newargument < newmin){
                        newmin = newargument;
                    }
                    
                }
                    
                double m = Double.parseDouble(args[ind]);
                    if(m > min){
                        min = m;
                    }
                
                System.out.printf("Minimum stevil %s je %.2f", argument, newmin );
            
            }
            else{
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[2]);
        
                if (args[1].equals("+")){
                    System.out.printf("%s + %s = %.2f\n", args[0], args[2], a+b);
                }
                else if (args[1].equals("-")){
                    System.out.printf("%s - %s = %.2f\n", args[0], args[2], a-b);
                }
                else if (args[1].equals("#")){
                    System.out.printf("%s * %s = %.2f\n", args[0], args[2], a*b);
                }
                else if (args[1].equals("/")){
                    System.out.printf("%s / %s = %.2f\n", args[0], args[2], a/b);
                }
                else if (args[1].equals("^")){
                    System.out.printf("%s ^ %s = %.2f\n", args[0], args[2], Math.pow(a,b));
                }
            
            
            }
        
        }
}

