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
public class DodajKImenu {
    static String dodaj(String imeDatoteke, String dodatek){
        StringBuffer sb = new StringBuffer(imeDatoteke);
        int i = sb.indexOf(".");
        
        if (i==-1)
            return imeDatoteke + dodatek;
        else{
            return sb.insert(i, dodatek).toString();
        }
    }
    
    public static void main(String[] args){
        System.out.println(dodaj("imeDatoteke.txt"));
    }
}

