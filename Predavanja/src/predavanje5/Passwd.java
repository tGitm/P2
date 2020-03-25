/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje5;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Passwd {
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("viri/passwd"));
        int max = 0;
        
        while(sc.hasNextLine()){
            String vrstica = sc.nextLine();
            String[] deliVrstice = vrstica.split(":");
            //System.out.printf("%d %s\n", deliVrstice[2], deliVrstice[0]);
            
            int uid = Integer.parseInt(deliVrstice[2]);
            if (uid > max){
                max = uid;
            }
        }
        sc.close();
    }
}
