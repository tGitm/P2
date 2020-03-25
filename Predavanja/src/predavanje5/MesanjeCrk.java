/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje5;

import java.util.Random;

/**
 *
 * @author Tim
 */
public class MesanjeCrk {
    
    static String premesaj(String beseda){
        char[] znaki = beseda.toCharArray();
        Random rnd = new Random();
        
        for (int x=0; x<rnd.nextInt(100); x++){
            int i = rnd.nextInt(beseda.length());
            int j = rnd.nextInt(beseda.length());
            
            char tmp = znaki[i];
            znaki[i] = znaki[j];
            znaki[j] = znaki[i];
            znaki[j] = tmp;
            
        }
        return new String(znaki);
    }
    
    public static void main(String[] args){
        String beseda = "simon";
        System.out.println(premesaj(beseda));
    }
}
