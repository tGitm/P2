
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Izpit2 {
    
    public static void main(String[] args){
        //zgoscenke("dancingQueen.txt", "waterloo.txt");
        //GUI2();
        //vlak();
    }
    
    static void zgoscenke(String imeDatoteke1, String imeDatoteke2){
        Map<String,String> slovar = new HashMap<String,String>();
        ArrayList<String> prva =new ArrayList<String>();
        ArrayList<String> druga =new ArrayList<String>();
        
        try{
            Scanner sc = new Scanner(new File(imeDatoteke1));
            while(sc.hasNextLine()){
                String [] vrsticaSplit = sc.nextLine().split(";");
                String cas = vrsticaSplit[1].trim();
                String naslov = (vrsticaSplit[0].substring(2, vrsticaSplit[0].length()).trim());
                slovar.put(naslov,cas);
                prva.add(cas+" "+naslov);
            }
            
            sc = new Scanner(new File(imeDatoteke2));
            while(sc.hasNextLine()){
                String [] vrsticaSplit = sc.nextLine().split(";");
                String cas = vrsticaSplit[1].trim();
                String naslov = (vrsticaSplit[0].substring(2, vrsticaSplit[0].length()).trim());
                if(slovar.containsKey(naslov)){
                    if(!(slovar.get(naslov).equals(cas))){
                        System.out.println(naslov);
                    }
                }
                druga.add(cas+" "+naslov);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File notfound!");
        }
        
        Collections.sort(prva);
        Collections.sort(druga);
        for(String a : prva){
            System.out.println(a);
        }
        for(String a : druga){
            System.out.println(a);
        }
    }
    
    static void GUI2(){
        JFrame okno = new JFrame("Obracanje");
        okno.setSize(300,80);
        okno.setLocation(500,500);
        okno.setResizable(false);
        okno.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel pan = new JPanel();
        pan.setBackground(Color.DARK_GRAY);

        JButton gumb = new JButton();
        gumb.setText("Obrni");

        JTextField txt1 = new JTextField();
        txt1.setPreferredSize(new Dimension(60,20));
        
        JTextField txt2 = new JTextField();
        txt2.setPreferredSize(new Dimension(60,20));
        
        gumb.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        txt2.setText(obrni(txt1.getText()));
                    }
                }
        );
        
        okno.add(pan);
        pan.add(txt1);
        pan.add(gumb);
        pan.add(txt2);
   
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    } 
    
    static String obrni(String niz){
        if (niz.isEmpty()){
		 return niz;
	}
        return obrni(niz.substring(1)+niz.charAt(0));
    }
    
    
    static void urska(String imeDatoteke1, String imeDatoteke2){
        try{
            Scanner sc = new Scanner(new File(imeDatoteke1)); 
            String [] prva = sc.nextLine().split(" ");
            String format = prva[0];
            int x = Integer.parseInt(prva[1]);
            int y = Integer.parseInt(prva[3]);
            PrintWriter writer = new PrintWriter(imeDatoteke2, "UTF-8");
            
            writer.println("G "+x+" x "+y);
            for(int piksel = 0; piksel<x*y;piksel++){
                int r = sc.nextInt();
                int g = sc.nextInt();
                int b = sc.nextInt();
                int grey = (int)(r+g+b/3);
                writer.print(grey+" ");
            } 
            writer.close();  
        
        }
        catch(FileNotFoundException e){
            System.out.println("file not found!");
        }
        catch(java.io.IOException e){
            System.out.println("neki");
        }
    }
    
    static void vlak(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vpisi k: ");int k = sc.nextInt();
        System.out.println("Vpisi h: ");int h = sc.nextInt();
        System.out.println("Vpisi m: ");int m = sc.nextInt();

        int startMin = 5*60;
        int endMin = 24*60;
        
        int naslednji = 0;
        for(int prihod = startMin; prihod<=endMin;prihod+=k){
            if(prihod>h*60+m){
                naslednji = prihod;
                break;
            }
        }
        
        int naslednjiH = naslednji/60;
        int naslednjiM = naslednji%60;
        
        System.out.println("Prispeli ste: "+h+":"+m);
        System.out.printf("Naslednji vlak: %02d:%02d\n",naslednjiH,naslednjiM);
    }
    
}
