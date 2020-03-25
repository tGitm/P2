package predavanje3;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Tim
 */
public class Pisanje_v_datoteko {
    
    public static void main(String[]args) throws Exception{
        
        PrintWriter pw = new PrintWriter(new File("Viri/file.txt"));
        
        int a = 3;
        for (int i=0; i< 10; i++){
            System.out.printf("%d * %d = %d\n", i, a, i*a);
        }
    }
}
