
public class DN02 {
    
    public static void main(String[] args) {
        String[] tab = args;
        
        int max_dol = najdaljsa(tab);
        
        zvezdice(max_dol+4);
        System.out.println();
        for (int i = 0; i < tab.length; i++){
           String poravnava_bes = sredina(tab[i], max_dol); //za poravnavo besedilo v kvadratku
           
           System.out.printf("* %" + max_dol +"s *\n", poravnava_bes);  //poravnan izpis besedila
           
        }
        zvezdice(max_dol+4); 
        System.out.println();
       
        //zvezdice(max_dol);      //mogoce bom rabil se +4 zaradi odmika  
    }
    
    public static String sredina(String cha, int max_dol){
        int praz_polje = max_dol - cha.length(); 
        int praz_pol = praz_polje / 2;
        
        for (int i=0; i<praz_pol; i++){
            cha = " "+cha;
        }
        for (int i=0; i<praz_pol;i++){
            cha += " ";
        }       
        return cha;
    } 
    
    public static void zvezdice(int st){
       /*   naloga iz zvezdic,ko smo jo resli na vajah.. za pomoc 
        
        for (int i = 0;i < st; i++){
            for (int j = 0; j < max_dol; j++) System.out.print(" ");
		for (int j = 0; j < max_dol; j++){	
			if ((i == 0 || i == st-1) || (j == 0 || j== max_dol-1)){
                            System.out.print("*");
				}
			else{
                            System.out.print(" ");
					}	
			}		
		}		
        */      
        for (int i=0; i<st; i++){
            System.out.print("*");
        }
    }
    
    public static int najdaljsa(String[] tab){
        int max_dol = 0;
        for (int j=1;j<tab.length; j++){
            if (tab[j].length() > max_dol){
                max_dol = tab[j].length();
                }    
            }
        return max_dol;
    }
    
               
}

