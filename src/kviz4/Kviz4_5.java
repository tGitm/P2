
package kviz4;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Kviz4_5 {
    
    static void izpisi(String imeDatoteke){
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        
        try {
            fis = new FileInputStream(imeDatoteke);
            dis = new DataInputStream(fis);
            String s = "";     
            int byteIndex = 1;  
              
            while(dis.available()>0){ 
             
                byte b = dis.readByte();
                int pos = (b & 0xFF);
                //int pos = dis.readByte();         // EQUALS ZNAK
                s += String.format("%08d", Integer.parseInt((Integer.toBinaryString(pos))));
      
                if (byteIndex % 3 == 0) {
                    String stevilka = String.valueOf(Integer.parseInt(s, 2)); 
                    System.out.printf("0%s / %s %s", stevilka.charAt(0), stevilka.substring(1, 4), stevilka.substring(4, 7));
                    System.out.println();
                    s = "";
                }       
                byteIndex++;
            }
            fis.close();
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    
    //Kviz4_5.preveri("03 / 973 081", "skrito.dat");
    static void preveri(String stevilka, String imeDatoteke){
        
        FileInputStream fis = null;
        ArrayList<String> seznam = new ArrayList<String>();
        
        try {
            fis = new FileInputStream(imeDatoteke);
            String s = "";     
            int byteIndex = 1;  
              
            while(fis.available()>0){ 
                int pos = fis.read();         // EQUALS ZNAK
                s += (String.format("%8s", Integer.toBinaryString(pos)).replace(" ", "0"));
                if (byteIndex % 3 == 0) {
                    String stevilka_ = String.valueOf(Integer.parseInt(s, 2)); 
                    String f = String.format("0%s / %s %s", stevilka_.charAt(0), stevilka_.substring(1, 4), stevilka_.substring(4, 7));
                    seznam.add(f);
                    s = "";
                }       
                byteIndex++;
            }
            fis.close();
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
        
        if(seznam.contains(stevilka)){
            System.out.println("Stevilka "+stevilka+" je v datoteki "+imeDatoteke+".");
        }
        else System.out.println("Stevilke "+stevilka+" ni v datoteki "+imeDatoteke+".");
    }
}
