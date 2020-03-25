/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Tim
 */
public class Urejanje {
    
    static void celaStevila(){
        ArrayList<Integer> stevila = new ArrayList();
        stevila.add(3);stevila.add(6);stevila.add(32);
        stevila.add(9);stevila.add(10);stevila.add(1);
        //int [] stevila = {3, 6, 32, 9 ,10, 1};
        
        Collections.sort(stevila);
            //Arrays.sort(stevila);   //urejanje tabelce
        
        //System.out.println(Arrays.toString(stevila));
        //for (int i=0; i<stevila.length; i++){
            //System.out.println(stevila[i] + " ");
           for (int i=0; i<stevila.length; i++){
            //System.out.println(stevila[i] + " ");
           }
        
        System.out.println("");
        
        for (int stevilo : stevila){
            System.out.println(stevilo + " ");
        }
        
    
    }
    
    public static void main(String[] args){
        celaStevila();
    }
}
