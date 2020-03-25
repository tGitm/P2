/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje11;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Tim
 */
public class Meseci {

    public static void main(String[] args){
        Map<String, Integer> meseci = new HashMap();
        
        meseci.put("Januar", 30);
        meseci.put("Februar", 28);
        meseci.put("Marec", 31);
        meseci.put("April", 30);
        meseci.put("Maj", 31);
        
        String mesec = "Februar";
        if (meseci.containsKey(mesec)){
            System.out.println("Število dni v mesecu %s je %d\n", mesec, meseci.get(mesec));
        }else{
                System.out.println("Mesec %s ne obstaja\n", mesec);
            }
        
        int v = 31;
        System.out.println("Ali obstaja mesec z " + v + " dnevi?" + meseci.containsValue(v));
                
        
    }
}
