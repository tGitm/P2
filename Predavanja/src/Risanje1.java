/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class Risanje1 {
    
    public static void main(String[] args){
        diagonala();
    }
    
    public static void diagonala(){
        StdDraw.setScale(-100, 100);
        
        int [][] smeri = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        int trSmer = 0;
        int trDolzina = 5;
        int deltaDolzina = 2;
        
        int x = 0;
        int y = 0;
        
        for (int i = 0; i< 200; i++){
            int nx = x + trDolzina * smeri[trSmer][0];
            int ny = x + trDolzina * smeri[trSmer][1];
        
            StdDraw.line(x, y, nx, ny);
            
            x = nx;
            y = ny;
            
            trSmer = (trSmer + 1) % 4;
            trDolzina += deltaDolzina;
        }
    }
}
