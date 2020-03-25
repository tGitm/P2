/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje12;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author Tim
 */
public class HexDump {
    
    public static void main(String[] args){
        try{
        FileInputStream fis = new FileInputStream(new File("viri/kratka"));
        int koliko = 0;
        
        while (fis.available() > 0){
            int bajt = fis.read();
            System.out.printf("%x", bajt);
            koliko++;
            
            if (koliko == 16){
                System.out.println();
                koliko = 0;
            }
        }
        
        fis.close();
        
        }catch (Exception e){
            System.out.println("Napaka pri branju!");
        }
        }
}
