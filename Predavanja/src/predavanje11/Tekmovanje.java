/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje11;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Tekmovanje {
   
    static Map<String, Drzava> preberiDrzave(String imeDatoteke) throws Exception{
        Map<String, Drzava> result = new HashMap();
        
        Scanner sc = new Scanner(new File(imeDatoteke));
        
        while(sc.hasNext()){
            String vrstica = sc.nextLine();
            String[] deli = vrstica.split(":");
            String kratica = deli[0];
            String glMesto = deli[1];
            int prebivalci = Integer.parseInt(deli[2]);
            
            Drzava d = new Drzava(kratica, glMesto, prebivalci);
            result.put(kratica, d);
        }
        sc.close();
        
        return result;
    }
    
    public static void main(String[] args) throws Exception{
        Map<String, Drzava> drzave = preberiDrzave("viri/drzave.txt");
    
        for (Drzava d : drzave.values()){
            System.out.println(d);
        }
        
        Scanner tipkovnica = new Scanner(System.in);
        System.out.println("Vpiši kratico: ");
        String kratica = tipkovnica.nextLine();
   
    
    }
}