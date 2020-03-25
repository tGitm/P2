
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class DN11 {
    
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("viri/kratka.txt"));
        String prebrano = " ";
        int st = 0;
        
        TreeMap<Integer, String> vsebina = new TreeMap();
  
        
        while(sc.hasNext()){
            prebrano = sc.nextLine();
            String [] split = prebrano.split(" ");
            vsebina.put(st, "split");
           
           
            
            for (int i=0; i<vsebina.size(); i++){
                if (vsebina.containsValue(".")){
                    vsebina.remove(".");
                }
                   // System.out.println(enpen[i]);
            }
        }
        
    }
}