/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje10;
import StdDraw;
import StdDraw;

/**
 *
 * @author Tim
 */
public class RisanjeLikov {
    
    public static void main(String[] args){
        StdDraw.setScale(-100, 100

        Lik[] liki = new Lik[100];
        liki[0] = new Krog(10, 10. 5. Color.red);
        liki[0].narisi();

        liki[1] = new Pravokotnik(10, 10. 5. Color.blue);
        liki[1].narisi();

        liki[2] = new Kvadrat(10, 10. 5. Color.yellow);
        liki[2].narisi();

        while(true){
            StdDraw.clear(Color.white);
            
            if (StdDraw.hasNextKeyTyped){
                char znak = StdDraw.nextKeyTyped();
                switch(znak){
                    
                }
            }
            
            for (int i = 0; i < stLikov; i++){
                liki[i].narisi();
            }
        }
        
        
    }
}
