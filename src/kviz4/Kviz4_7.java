package kviz4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Kviz4_7 {
    
    static void izpisiBesedilo(String imeDatoteke, int n, int s){
        ArrayList<String> seznam = new ArrayList<String>();
        try{
            Scanner sc = new Scanner(new File(imeDatoteke));

            while(sc.hasNextLine()){
                String besedilo = sc.nextLine();
                String vrstica = "";
                String [] splitted = besedilo.split(" ");
    
                for(String beseda: splitted){
                    String pot = vrstica+beseda;
                    if(pot.length()<=n){
                       vrstica+=(beseda+" ");
                       if(beseda.equals(splitted[splitted.length-1])){
                           seznam.add(vrstica.trim());
                           break;
                       }  
                    } 
                    else {
                        seznam.add(vrstica.trim());
                        vrstica = beseda+" ";
                    }
                }                 
            }   
        }catch(java.io.FileNotFoundException e){}
        
        for(String vrstica: seznam){
            try{
                int stpik = (s-vrstica.length())/2;
                for(int i = 0; i<stpik;i++)System.out.print(".");        
                System.out.print(vrstica);
                for(int i = 0; i<stpik;i++)System.out.print("."); 
                System.out.println();
            }
            catch (Exception e) { 
                //odvecna pika na desni
            }
            
        }
        
    }
    
    
}
