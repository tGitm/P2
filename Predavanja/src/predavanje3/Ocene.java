package predavanje3;

import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Ocene {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int stOcen = 0; //koliko ocen sem prebral
        int vsota = 0;  //vsota vseh prebranih ocen
        
        int ocena = 0;
        
        do{
            System.out.println("Vpiši ocena: ");
            ocena = sc.nextInt();
            
            if (stOcen != 0){
                vsota = vsota + ocena;
                stOcen++;
            }
            
        }while(ocena != 0);
        
        if (stOcen == 0){
            System.out.print("Ok.");
        }else{
            //če sta oba celi števili potem je tole celoštevilsko deljenje!!
        System.out.println(vsota / stOcen);
        }
    }
}
