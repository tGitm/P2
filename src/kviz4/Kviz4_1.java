package kviz4;


import java.util.*;
import java.io.*;
import java.io.File;


public class Kviz4_1 {
    
    public static void main(String [] args){
    
    }
    
    static void dvojnaNagrade(String igralkeFilename, String igralciFilename){

        TreeMap<String, String> slovar = new TreeMap<String, String>();

        List<List<String>> records = new ArrayList<>();

        for(int i = 0;i<2;i++){

            try (BufferedReader br = new BufferedReader(new FileReader(igralkeFilename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(", ");
                    String film = values[4];
                    String leto = values[1];
                    String oseba = values[3];

                    String niz;

                    if(i == 0){
                        niz = leto+":"+oseba;
                        slovar.put(film,niz);
                    }
                    else{
                        if(slovar.containsKey(film)){
                            niz = slovar.get(film);
                            slovar.put(film,niz+":"+oseba);
                        }
                        else{
                            niz = leto+":"+oseba;
                            slovar.put(film,niz);
                        }

                    }
                }
            }
            catch (IOException ie){}
            igralkeFilename = igralciFilename;
        }

        for (Map.Entry<String, String> entry : slovar.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            String [] splitted = val.split(":");
            if(splitted.length>2){
                System.out.println("Film: "+key+", Leto: "+splitted[0]+", Igralka: "+splitted[1]+", Igralec: "+splitted[2]);
            }
        }





    }
    
}
