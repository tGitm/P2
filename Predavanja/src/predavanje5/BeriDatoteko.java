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
public class BeriDatoteko {
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("viri/passwd"));
        sc.useDelimiter("\\Z");
        
        String vsebina = sc.next();
        
        sc.close();
        System.out.println(vsebina);
        }
        
    }

