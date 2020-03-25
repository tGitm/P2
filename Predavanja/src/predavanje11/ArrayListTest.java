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
public class ArrayListTest {
    
    public static void main(String[] args){
        ArrayList<String> dnevi = new ArrayList();
        
        dnevi.add("Ponedeljek");
        dnevi.add("Torek");
        dnevi.add("Sreda");
        dnevi.add("Četrtek");
        dnevi.add("Petek");
        
        System.out.println(dnevi.get(0));   //lahko izpišem določeni element množice
        
        dnevi.add(0, "Nedelja");
        
        for (String dan : dnevi){
            System.out.println(dan);
        }
    }
}
