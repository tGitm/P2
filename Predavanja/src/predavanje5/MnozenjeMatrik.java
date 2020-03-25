/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje5;

/**
 *
 * @author Tim
 */
public class MnozenjeMatrik {
    
    int [][] a = {{1,2}, {3,4}};
    int [][] b = {{1,2}, {3,4}};
    
    
    public static void main(String[] args){
        int [][] c = new int[a.length][a.length];
        
        for (int i=0; i<a.length; i++){
            for (int j=0;j<a.length; j++){
                c[i][j] = 0;
                for (int k=0; k<10; k++){
                    c[i][j] = c[i][j] + a[i][k]*b[i][j];
                }
        }
    
    }
}
}