package kviz4;

public class Kviz4_10 {
    
     static void izpisi(int znak[]){
         for(int a : znak){
             String binarno = Integer.toBinaryString(a);
             for(int i = 0; i<binarno.length();i++){
                 if(binarno.charAt(i) == '1')System.out.print("*");
                 else System.out.print(" ");
             }
             System.out.println();
         }     
     }
    
}
