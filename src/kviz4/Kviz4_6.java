
package kviz4;


public class Kviz4_6 {
    
    static int [] getVrstica(int n){
    
        int prva = 1;
        int st = 1;
        int [] prejsna = {1};
 
        while(1<2){
            int [] tabela = new int[st];
            tabela[0] = prva++;
            if(prva == 10){
                prva = 0;
            }
            for(int i = 1; i<st; i++){
                int rez = (tabela[i-1] + prejsna[i-1])%10;
                tabela[i] = rez;
            }  
            prejsna = tabela;
            if(st==n) return tabela;
            st++;
        }
 
    }
    
}
