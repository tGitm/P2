/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje11;

import java.util.*;

/**
 *
 * @author Tim
 */
public class Delitelji {
    //metoda vrne množico deliteljev števila a
    static Set<Integer> delitelji (int a){
        Set<Integer> result = new TreeSet<>();
        
        for (int i = 1; i <= a/2; i++){
            if(a%i==0){
                result.add(i);
            }
        }
        result.add(a);
        return result;
    }
    
    public static void main(String[] args){
        int a = 122;
        int b = 216;
        
        Set<Integer> da = delitelji(a);
        Set<Integer> db = delitelji(b);
        
        System.out.printf("Delitelji števila %d, so %s\n", a, da);
        System.out.printf("Delitelji števila %d, so %s\n", b, db);
        
        Set<Integer> vsi = new TreeSet();
        vsi.addAll(da); vsi.addAll(db);
        System.out.printf("Vsi delitelji so %s\n", vsi);
        
        Set<Integer> skupni = new TreeSet();
        skupni.addAll(da); skupni.retainAll(db);
        System.out.printf("Skupni delitelji so %s\n", skupni);
        System.out.println(delitelji(100));
    }
}
