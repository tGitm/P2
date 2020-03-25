/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Izjema {
    static void preberiDatoteko(){
        try{
        
        Scanner sc = new Scanner(new File("viri/kratka.txt"));
        
        int stVrstic = 0;
        int celotnaDolzina = 0;
        
        while(sc.hasNextLine()){
            String vrstica = sc.nextLine();
            stVrstic++;
            celotnaDolzina += vrstica.length();
            
        }
        sc.close();
        
        System.out.printf("Povprecna dolzina: %.2f\n", 1.0*celotnaDolzina/stVrstic);
    }
        catch (Exception e){
        System.out.println("Napaka");
        System.out.println(e.toString());
    }   
        }
    public static void main(String[] args){
        preberiDatoteko();
    }
}
