/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kviz4;

import java.io.DataInputStream;
import java.io.FileInputStream;




public class Kviz4_8 {
    
    public static class MojException extends Exception{
	public MojException(String message){        //konstruktor
	    super(message);
	}
    }
    
    static void izracunaj(String imeDatoteke) throws MojException{  
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        
        try {
            fis = new FileInputStream(imeDatoteke);
            dis = new DataInputStream(fis);
            
            String format = "";
            
            for(int i = 0; i<4;i++) format += (Integer.toHexString(dis.readByte() & 0xFF));

            if (!format.equals("43414c43")){
                throw new MojException("narobn format!");
            }
              
            int stRacunov = dis.readInt();
           
            for(int i = 0; i<stRacunov; i++){
                int a = dis.readInt();
                char simbol = (char) (dis.readByte());
                int b = dis.readInt();
                int c = 0;
                switch(simbol){
                    case '+':c=a+b;break;
                    case '-':c=a-b;break;
                    case '/':c=a/b;break;
                    case '*':c=a*b;break;
                    default:
                }
                System.out.println(c);
            }

            fis.close();
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        }

    
    }
    
}
