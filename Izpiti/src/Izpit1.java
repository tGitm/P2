import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.HashMap;
import java.util.Map;


public class Izpit1 {
    
    public static void main(String [] args) throws FileNotFoundException, IOException{

    }
    
    
    static void AlCapone(String imeDatoteke){
    
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(imeDatoteke);
            dis = new DataInputStream(fis);
            
            int rez = 0;
            int maxNakup = 0;
  
            while(dis.available()>0){ 
                int a = dis.readInt();         
                rez+=a;
                if(a<0 && a<maxNakup) maxNakup = a;
            }
            dis.close();
            
            System.out.println("Stanje: "+rez+"");
            System.out.println("Najvecji nakup: "+maxNakup+".");
            
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    

    
    static abstract class Kocka{
        abstract int vrziKocko();
    }
    
    static class PravicnaKocka extends Kocka{
        int vrziKocko(){
            return ((int)(Math.random()*6)+1);
        }
    }
    
    static class GoljufivaKocka extends Kocka{
        int vrziKocko(){
            double x = Math.random();
            if(x>0.5) return 6;
            else return 1;
        }
    }
    
    
    
    static void vrzel(String imeDatoteke){
    
       try{
           Scanner sc = new Scanner(new File (imeDatoteke));
           ArrayList<Integer> seznam = new ArrayList<Integer>();
           while(sc.hasNextInt()){
               seznam.add(sc.nextInt());
           }
           
           Collections.sort(seznam);
           int maks = 0;
           for(int i = 0; i<seznam.size()-1;i++){
               int razlika = seznam.get(i+1)-seznam.get(i);
               if(razlika>maks) maks = razlika;
           }

           System.out.println(maks);
       }
       catch(FileNotFoundException e){
       }
    }
    
    
    static void GUI(){
        JFrame okno = new JFrame("Moje prvo okno");
        okno.setSize(600,300);
        okno.setLocation(500,500);
        
        Map<String,Integer> slovar = new HashMap<String,Integer>();

        JTextArea jta = new JTextArea();
        okno.add(jta);

        jta.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
              String koor = String.format("(%d,%d)", e.getX(), e.getY());
              if(slovar.containsKey(koor)) slovar.put(koor,slovar.get(koor)+1);
              else slovar.put(koor,1);
              jta.setText("Koordinata "+koor+" je bila obiskana "+slovar.get(koor)+"-krat\n");
             
            }      
        }
        );

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    } 
}
