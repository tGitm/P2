/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje11;

import java.util.HashSet;
import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;

/**
 *
 * @author Tim
 */
public class Dnevi {
    
    public static void main(String[] args){
    Set<String> dnevi = new HashSet();
    
    dnevi.add("Ponedeljek");
    dnevi.add("Torek");
    dnevi.add("Sreda");
    dnevi.add("Četrtek");
    dnevi.add("Petek");
    
    System.out.println("Število dni v tednu: " + dnevi.size());
    System.out.println("Ali je ponedeljek dan v tednu? " + dnevi.contains("Ponedeljek"));
    
    //izpis vseh elementov množice s pomočjo iteratorja
    
    System.out.println();
    System.out.println("Dnevi tedna: ");
    
    Iterator<String> it = dnevi.iterator();
    while(it.hasNext()){
        String dan = it.next();
        System.out.println(dan);
        if (dan.equals("Ponedeljke")){
            it.remove("Ponedeljek");
        }
    
    }
    System.out.println("Še enkrat: ");
    for (String dan : dnevi){
        System.out.println(dan);
    }
}
    
}

