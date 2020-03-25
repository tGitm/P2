package predavanje6;

/**
 *
 * @author Tim
 */
public class Graf {
    
    static final int H = 25;
    static final int W = 80;
    
    static char[][] zaslon = new char[H][W];
    
    static void pobrisiZaslon(){
        for (int i=0; i<H; i++){
            for (int j=0; j<W; j++){
                zaslon[i][j] = ' ';
            }
        }
    }
    
    static void koordinatniSistem(){
        for (int i=0; i<W; i++){
            zaslon[H/2][i] = '-';
        }
        for (int k=0; k<H; k++){
            zaslon[k][W/2] = '|';
        }
        zaslon[H/2][W/2] = '+';
    }
    
    static void graf(){
        double x1 = -2*Math.PI;
        double x2 = 2*Math.PI;
        double y1 = -1;
        double y2 = 1;
        
        for (int i=0; i<W; i++){
            double x = i*(x2-x1)/(W-1)+x1;
            double y = Math.sin(x);
            
            int j = (int)((H-1)*(y-y1)/(y2-y1));
            
            if (j >=0 && j <H)
                zaslon[H-j-1][i] = '*';
        }
        
    }
    
    static void izris(){
         for (int i=0; i<H; i++){
            for (int j=0; j<W; j++){
                System.out.print(zaslon[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        pobrisiZaslon();
        koordinatniSistem();
        graf();
        izris();
    }
}
