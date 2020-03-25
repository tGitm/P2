/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class PajkovaMreza {
    
    public static void main(String[] args){
        
        int krakov = Integer.parseInt(args[0]);
        int zavojev = Integer.parseInt(args[1]);
        int razmik = Integer.parseInt(args[2]);
        
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(-400, 400);
        StdDraw.setYscale(-300, 300);
        
        for (int i = 0; i < krakov; i++){
            double x = Math.cos(i * 2 * Math.PI / krakov) * zavojev * razmik;
            double y = Math.sin(i * 2 * Math.PI / krakov) * zavojev * razmik;
            StdDraw.line(0, 0, x, y);
        }
        
        for (int r = 0; r < zavojev; r++){
            for (int a = 0; a< krakov; a++){
                double x1 = (r + 1.0 * a / krakov) * Math.cos(a * 2 * Math.PI / krakov) * razmik;
                double y1 = (r + 1.0 * a / krakov) * Math.sin(a * 2 * Math.PI / krakov) * razmik;

                double x2 = (r + 1.0 * (a + 1) / krakov) * Math.cos((a + 1) * 2 * Math.PI / krakov) * razmik;
                double y2 = (r + 1.0 * (a + 1) / krakov) * Math.sin((a + 1) * 2 * Math.PI / krakov) * razmik;

                StdDraw.line(x1, y1, x2, y2);

            }
        }
        
    }
}
