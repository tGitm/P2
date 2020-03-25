package vaje3;

import java.util.Random;

/**
 *
 * @author Tim
 */
public class Tarok {
        static char pik  = '\u2660'; // ♠
        static char kriz = '\u2663'; // ♣
        static char srce = '\u2665'; // ♥
        static char karo = '\u2666'; // ♦

        static char barve[] = {srce, karo, kriz, pik};
        static String prazneRdece[] = {"1", "2", "3", "4"};
        static String prazneCrne[] = {"7", "8", "9", "10"};

        static String figure[] = {"Fant", "Kaval", "Dama", "Kralj"};

        static String taroki[] = {
             "I", "II", "III", "IIII", "V", "VI", "VII",
             "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
             "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
             "XXI", "SKIS"};
        
    public static void main(String[] args){
     // String[] karte = ustvariKarte();
      //izpisi(karte);
        
    }
    
    public static void izpisi(String[] karte){
        for (int i=0; i<karte.length; i++){
            System.out.printf("%-10s", karte[i]);
            if (i==7 || i==15 ||i==23 || i==31 || i==39 || i==47){
                System.out.println();
                
            }
        }
    }
    
    public static int preprostoStetje(String karte[]){
        if ((karte.equals("SKIS") || karte.equals("XXI") ||karte.equals("I"))){
            return 5;
        }
        else if(karte.equals("Kralj")){
            return 5;
        }
        else if(karte.equals("Kraljica")){
            return 4;
        }
        else if (karte.equals("Kaval")){
            return 3;
        }
        else if (karte.equals("Fant")){
            return 2;
        }
        else{
            return 1;
        }
        
    }
    
    public static void premesajKarte(String karte[], int koliko){
      /*  Random rnd = new Random();
        
        for (int i=0; i<karte.length; i++){
            idx1 = rnd.nextInt(54);
            idx2 = rnd.nextInt(54);
            String tmp = karte[idx1];
            karte[idx2] = karte[idx1];
            karte[idx1] = karte[idx2];            
        }
    }
    */
    //public static String[] ustvariKarte(){
    //    String[] karte = new String[54];
        int ind = 0;
        
        for (int i=0; i<barve.length; i++){
            
            
            for (int j=0; j<prazneRdece.length; j++){
                if (i==0 || i==1){     
                    karte[ind++] = (barve[i] + prazneRdece[j]);

                }else{
                    karte[ind++] = (barve[i] + prazneCrne[j]);
                
                }
               // System.out.println(barve[i] + ((i == 0 || i == 1)?prazneRdece[j]:prazneCrne[j]));
            }
            
                for (int k=0; k<figure.length; k++){
                    karte[ind++] = (barve[i] + figure[k]);
                }   
        }
        
        for (int z=0; z<taroki.length; z++){
            karte[ind++] = (taroki[z]);
            
        }
        
      //  return karte;
        }     
}

