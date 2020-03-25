/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje5;

/**
 *
 * @author Tim
 */
public class SplitDemo {
    
    public static void main(String[] args){
        String vrstica = "Micka Gleda Sonce";
        String[] deliVrstice = vrstica.split("");
        
        for (int i=0; i<deliVrstice.length; i++){
            System.out.println(deliVrstice[i]);
        }   
       
    }
}
