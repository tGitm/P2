package predavanje3;

import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class VnasanjeScanner {
    
    public static void main(String[] args){
        String ime;
        
        System.out.print("Vpiše ime: ");
        Scanner sc = new Scanner(System.in);    //se povežem z tipkovnico
        ime = sc.nextLine();    //next() prebere vse do presledka, nextLine() pa čisto ce vnos
    
        System.out.println("Pozdravljen, " + ime + ".");
        
        System.out.print("Vpiše starost: ");
        int starost = sc.nextInt();
        System.out.println("Ulala, a res že " + starost + ".");
    }
}
