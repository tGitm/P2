
package predavanje9;

import java.io.File;

/**
 *
 * @author Tim
 */
public class Ls {
    
    public static void main(String[] args){
    File f = new File("/delo");
    String[] vsebina = f.list();

    for (int i = 0; i < vsebina.length; i++){
        File trFile = new File(f, vsebina[i]);

        System.out.printf("%c %10d %s\n",(trFile.isDirectory() ? 'd' : '-'), trFile.length(), vsebina[i]);
    }
    }
}
