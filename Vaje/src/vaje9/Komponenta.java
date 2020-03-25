package vaje9;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Komponenta {
    String ime;
    double cena;
    int popust;
    
    public Komponenta(String ime, double cena, int popust){
        this.ime = ime;
        this.cena = cena;
        this.popust = popust;
        
    }
    
    public String toString(){
       return String.format("%s, cena s popustom: %.2f EUR", ime, cenaSPopustom());
        
    }
    
    public double cenaSPopustom(){
        return ((100 - popust) / 100.0) * cena;
    }
    
}    
class Pomnilnik extends Komponenta{ 
    int tip;
    int velikost;
    int hitrost;
    
    public Pomnilnik(String ime, double cena, int tip, int velikost, int hitrost){
        super(ime, cena, 10);
        this.tip = tip;
        this.velikost = velikost;
        this.hitrost = hitrost;
    }
    
    public String toString() {
        return String.format("Pomnilnik: %s\nTip: %s, Velikost: %s, Hitrost: %dMHz", ime, cenaSPopustom(), super.toString(), vrniTip(), velikost, hitrost); 
    }
    
    public String vrniTip(){
        switch (tip){
            case 0: return "SDRAM";
            case 1: return "DDR1";
            case 2: return "DDR2";
            case 3: return "DDR3";
            
        }
        return "";
    }
    
}
class Procesor extends Komponenta{
    String podnozje;
    int stJeder;
    int hitrostJedra;
    
    public Procesor(String ime, double cena, String podnozje, int stJeder, int hitrostJedra){
        super(ime, cena, 5);
        this.podnozje = podnozje;
        this.stJeder = stJeder;
        this.hitrostJedra = hitrostJedra;
        
    }
    
    public String toString() {
        return String.format("Procesor: %s\nPodnozje: %s, St. jedr: %s, Hitrost jedra: %dMHz", ime, cenaSPopustom(), super.toString(), podnozje, stJeder, hitrostJedra); 
    }
}
   
 





//    public static void main(String[] args) throws Exception{
//        String[] tabb; 
//    
//        Scanner sc = new Scanner(new File("viri/komponente.txt"));
//        Komponenta[] tab = new Komponenta[100];
//        int stevec = 0;
//        
//        while(sc.hasNext()){
//            String prebrano = sc.nextLine();
//            
//            if (prebrano.contains(";")){
//                tabb = prebrano.split(";");
//                tab[stevec] = new Komponenta();
//                tab[stevec].ime = tabb[0];
//            }
//            
//        }
//        
//    }
    

