package kviz4;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class IzjemaManjkajocegaLocila extends RuntimeException {
  @Override
  public String getMessage() {
    return "mAnJKAjOce locIlO";
  }
}

public class Kviz4_3 {
  
    static void statistikaStavkov(String imeDatoteke) throws IzjemaManjkajocegaLocila{
        Map<Integer, Integer> slovar = new HashMap<Integer, Integer>();
        ArrayList<String> seznam = new ArrayList<String>();
        
        try{
            Scanner sc = new Scanner(new File(imeDatoteke));
            while(sc.hasNextLine()){
                String vrstica = sc.nextLine();
                String [] splitted = vrstica.split(" ");
                
                int st = 1;
                for(String a : splitted){
                    if(a.contains(".") || a.contains("?") || a.contains("!")){
                        if(slovar.containsKey(st)) slovar.put(st,slovar.get(st)+1);                                                 
                        else slovar.put(st,1);      
                        st = 0;
                        st--;
                    }
                    st++;
                } 
            }
        }
        catch(java.io.FileNotFoundException e){
            System.out.println("Datoteka ne obstaja!");
        }
    
        List sortedKeys = new ArrayList(slovar.keySet());
        Collections.sort(sortedKeys);
       
        for(Object a : sortedKeys){
            System.out.println("key: "+a+" value: "+slovar.get(a));
        }

    }
}
