
package kviz4;


public class Kviz4_4 {

     static void preberiRacunInIzpisi(String imeDatoteke){
         try{
            java.util.Scanner sc = new java.util.Scanner(new java.io.File(imeDatoteke));
            double brez = 0;
            double skupaj = 0;
            double DDV = 0;
            while (sc.hasNextLine()) {
                String vrstica = sc.nextLine();
                String [] splitted = vrstica.split("\t");
                if(splitted.length>2){
                    DDV+=Double.parseDouble(splitted[1].replace(",","."));
                    skupaj+=Double.parseDouble(splitted[2].replace(",","."));
                 
                }
            }
            System.out.printf("DDV: %.2f\nZnesek skupaj: %.2f\nBrez DDV: %.2f",DDV,skupaj,(skupaj-DDV));
            
        }
        catch(java.io.FileNotFoundException e){
            System.out.println("file not found G");
        }
         
         
         
     }
    
}
