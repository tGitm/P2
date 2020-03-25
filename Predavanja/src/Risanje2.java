/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class Risanje2 {
    
    public static void grafFunkcije(){
        final int H = 250;
        final int W = 800;
        
        int pi = -1;
        int pj = -1;
        
        StdDraw.setXscale(0, W - 1);
        StdDraw.setYscale(0, H - 1);
        
        StdDraw.setPenRadius(0.005);
        
        StdDraw.line(0, H/2, W-1, H/2);
        StdDraw.line(W/2, 0, W/2, H-1);
        
        double x1 = -2 * Math.PI;
        double x2 = 2 * Math.PI;
        double y1 = -0.01;
        double y2 = 0.01;
        
        for (int i = 0; i < W; i++){
            double x = i * (x2- x1) / (W - 1) + x1;
            double y = Math.sin(x);
            
            int j = (int) ((H - 1) * (y - y1) / (y2-y1));
            
            if (j >= 0 && j< H){
                if (pi == -1){
                    StdDraw.line(i, H - j - 1, i, H - j - 1);
                    
                }
                else{
                    StdDraw.line(pi, pj, i, H - j - 1);
                }
            }
            
        }

    }
    
    public static void main(String[] args){
        grafFunkcije();
    }
}
