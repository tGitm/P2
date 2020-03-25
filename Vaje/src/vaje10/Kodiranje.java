/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaje10;

/**
 *
 * @author Tim
 */
public class Kodiranje {
    interface Kodirnik{
        String enkripcija(String besedilo);
//            String[] zakodirano = new String[100];
//            int [] kljuc = new int [10];
//            
//            int k = 2;
//            
//            
//            zakodirano += besedilo;
//            
//            for (int i=0; i<=zakodirano.length; i++){
//                if (zakodirano[i].equals(" ")){
//                    continue;
//                }
//                zakodirano[i] = niz[i] ^ kljuc[i % kljuc.length]
//                
//            }
//        
        public abstract String dekripcija(String besedilo);
            
        
    }
    
    class CezarjevAlgoritem implements Kodirnik{
        int zamik;
        String besedilo;
        
        CezarjevAlgoritem(int zamik){
            this.zamik = zamik;
            
        }
           
        char cdChar(char c, int skw, int sign){
            int val = (int)c - skw + zamik * sign;
            while (val<0) val+=26;
            return (char)(c%26 + skw);
        }
        
        @Override
        public String enkripcija(String besedilo) {
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i< besedilo.length(); i++){
                char c = besedilo.charAt(i);
                
                if (Character.isLetter(c)){
                    c = cdChar(c, Character.isLowerCase(c) ? (int)'a' : (int)'A',1);
                    sb.append(c);
                }
                else{
                    sb.append(c);
                }
                return sb.toString();
            }
            
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String dekripcija(String besedilo) {
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i< besedilo.length(); i++){
                char c = besedilo.charAt(i);
                
                if (Character.isLetter(c)){
                    c = cdChar(c, Character.isLowerCase(c) ? (int)'a' : (int)'A',1);
                    sb.append(c);
                }
                else{
                    sb.append(c);
                }
                return sb.toString();
            }
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
       
        
        
    }
    
    class XOR implements Kodirnik{
        int kljuc;
        
        XOR(int kljuc){
            this.kljuc = kljuc;
        }

        @Override
        public String enkripcija(String besedilo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String dekripcija(String besedilo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    
    public static void main(String[] args){
        String besedilo = "mitja";
        
        for (int i=0; i<besedilo.length(); i++){
            System.out.printf("%c %d %d %c\n", besedilo.charAt(i), ((int)besedilo.charAt(i))-1, ((int)besedilo.charAt(i))-1, (char)(((int)besedilo.charAt(i))-1));
        }
    }
    
    
}
