import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Tim
 */

public class DN05 {
    
    public static void analizirajTemperature(String bes) throws Exception{
        
        
        Scanner sc = new Scanner(new File(bes));
       
        
        double povprecje = 0;
        double sestevek = 0;
        int stevec = 0;
   
        
        
        double [] temps = new double [5];
        
        while (sc.hasNextDouble()){
            double prebrano = sc.nextDouble();
            
            if (stevec < 5){
                temps[stevec] = prebrano;
                
            }else{
                for (int i=0; i<temps.length; i++){
                    for (int x=i+1; x<temps.length; x++){
                        double trenutna = 0;
                        if (temps[i] > temps[x]){
                            trenutna = temps[x];
                            temps[x] = temps[i];
                            temps[i] = trenutna;
                        }
                    }
                }
                
                if (temps[0] < prebrano){
                    temps[0] = prebrano;
               }
                
            }     
            stevec++;
            sestevek = sestevek + prebrano;
        }
            povprecje = sestevek / stevec;
            

        System.out.printf("Povprecje zapisanih temperatur je %.2f. \n", povprecje);
        
        
        System.out.println("Najvisjih 5 temperatur: ");
        for (int k=temps.length-1; k>=0; k--){
            System.out.printf("%.2f\n", temps[k]);
        }
        sc.close();
    }
    
    public static int[][] preberiResitevSudoku(String resitev) throws Exception{
        Scanner sc = new Scanner(new File(resitev));
        
        int [][] kvadrat = new int[25][25];
        
        for (int q=0; q<kvadrat.length; q++){
            for (int k=0; k<kvadrat.length; k++){
                int stevilka = sc.nextInt();
                kvadrat[q][k] = stevilka;
            }
       
        }    

        return kvadrat;
    }
    
    public static boolean preveriSudoku(int[][] kvadrat){
       
        for (int i=0; i<kvadrat.length; i++){
            for (int k=0; k<kvadrat.length; k++){
               for (int j=k; j<25; j++){
                   if(kvadrat[i][k] == kvadrat[i][j]){
                       return true;
                   }else return false;
               } 
            }
        }
        return false;
    }
        
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.GERMAN);
        
        if (args.length == 1){
            analizirajTemperature(args[0]);
            
        }else if (args.length >1){
            int [][] kvadrat = preberiResitevSudoku(args[0]);
            preveriSudoku(kvadrat);
            
        } 
    }
}
