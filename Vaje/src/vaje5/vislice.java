package vaje5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class vislice {
    
    static final int MAX_NAPAK = 10;

  // Seznam fraz; dopolnite ga s poljubnimi frazami
    // (vec ko jih bo, bolj zabavna bo igra)
    static String[] fraze = {"SONCE SIJE", "TRAVA RASTE", "KOLESAR BRZI",
        "ZIDAR ZIDA", "METLA POMETA", "VELIKA NOGA", "RDECA VRTNICA",
        "SLEPA ULICA", "MODRINA NEBA", "SABLJA", "NETOPIR", "KOLOVRAT",
        "SMUCANJE", "BELE STRMINE", "OTROCI SE ZOGAJO", "BABICA LIKA",
        "PROGRAMER PROGRAMIRA", "SKAF IMA LUKNJO", "VISLICE SO ZABAVNE"};

    // fraza, ki jo uganjujemo
    static String fraza;

    // katere crke smo ze uganili
    static boolean uganil[];

    static int steviloNapak;

    static void novaIgra() {
        Random rnd = new Random();
        int random = rnd.nextInt(fraze.length);
                
        fraza = fraze[random];
        uganil = new boolean[fraze.length];
        for (int i=0; i<fraza.length(); i++){
            if (fraza.charAt(i) == ' '){
                uganil[i] = true;
            }else{
                uganil[i] = false;
            }
        }
        steviloNapak = 0;
    }

    static boolean jeUganil() {
        boolean sprem = true;
        
        for (int i=0; i<uganil.length; i++){
            if (uganil[i] && sprem){
                sprem = true;
            }else{
                sprem = false;
            }
         } 
        return false;
    }

    static void izpisiUganko() {
        
        for (int i=0; i<uganil.length; i++){
            if (uganil[i] == false){
                System.out.print("_");
            
            }else{
                System.out.print(fraza.charAt(i));
            }
        }
    }

    static void postaviVprasanje() {
        boolean sprem = false;
        System.out.printf("Naredite lahko še %d napak.", steviloNapak);
        Scanner sc = new Scanner(System.in);
        String beseda = sc.nextLine();
        int steviloPoskusov = 10;
        
        for (int i=0; i<fraza.length(); i++){
            if (fraza.charAt(i) == beseda.charAt(i)){
                uganil[i] = true;
                sprem = true;
                System.out.println(beseda.charAt(i));   
            
            }else{
                uganil[i] = false;
            }
        }
        
        sc.close();
    }

    public static void main(String args[]) {
        novaIgra();
        while ((steviloNapak < MAX_NAPAK) && !jeUganil()) {
            izpisiUganko();
            postaviVprasanje();
        }
        if (jeUganil()) {
            System.out.println(fraza);
            System.out.println("Bravo!");
        } else {
            System.out.println("Konec igre! Pravilen odgovor je: " + fraza);
        }
    }
}