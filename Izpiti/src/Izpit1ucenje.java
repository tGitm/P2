import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Izpit1ucenje {

    public static void main(String[] args){

    }

    static void mafija(String imeDatoteke){
        FileInputStream fis = null;
        DataInputStream dis = null;

        try{

            fis = new FileInputStream("files/dobicki");
            dis = new DataInputStream(fis);

            int maxNakup = 0;
            int dob = 0;

            while (dis.available() > 0){
                int branje = dis.readInt();
                dob += branje;

                if (branje > 0 && branje > maxNakup){
                    maxNakup = branje;
                }

                System.out.println("Trenutno stanje: " + dob + ".");
                System.out.println("Maksimalen nakup: " + maxNakup + ".");

            }
                dis.close();

        } catch (java.io.IOException e){
            e.printStackTrace();
        }

    }



    static abstract class Kocka{
        abstract int vrziKocko();
    }

    static class PravicnaKocka{
        int vrziKocko(){
            int stevilo = ((int) (Math.random()*6)+1);
            return stevilo;
        }

    }

    static class GoljufivaKocka{
        int vrziKocko(){
            double st = Math.random();

            if (st > 0.5) return 6;
            else return 1;


        }
    }

    static void najVrzel(String imeDatoteke){
        try{
            Scanner sc = new Scanner(new File(imeDatoteke));
            ArrayList<Integer> stevila = new ArrayList<Integer>();

            while(sc.hasNextInt()){
                stevila.add(sc.nextInt());

            }

            Collections.sort(stevila);
            int najRazl = 0;

            for (int i = 0; i<stevila.size()-1; i++){
                int razmak = stevila.get(i+1) - stevila.get(i);

                if (razmak > najRazl)
                    najRazl = razmak;
            }

            System.out.println("Največja razlika med številoma je: " + najRazl);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    static void miska(){
        JFrame okno = new JFrame("blabalbalb");
        okno.setSize(500, 250);
        okno.setLocation(500, 500);

        HashMap<String, Integer> slovarcek = new HashMap<String, Integer>();

        JTextArea jta = new JTextArea();
        okno.add(jta);

        jta.addMouseMotionListener(new MouseMotionAdapter(){
           public void mouseMoved(MouseEvent e){
               String koor = String.format("(%d, %d)", e.getX(), e.getY());

               if (slovarcek.containsKey(koor)){
                   slovarcek.put(koor, slovarcek.get(koor)+1);
               } else{

                   slovarcek.put(koor, 1);
               }

               jta.setText("Koordinata" + koor + " je bila obiskana " + slovarcek.get(koor) + "-krat.");

        }



            });

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

}
