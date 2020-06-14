package kviz4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Kviz4_9 {
    
    public static class MojException extends Exception{
	public MojException(String message){        
	    super(message);
	}
    }

    static void histogram(String imeDatoteke) throws MojException{
        FileInputStream fis = null;
        DataInputStream dis = null;
        TreeMap<String,Integer> slovar = new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);
        
        try {
            fis = new FileInputStream(imeDatoteke);
            dis = new DataInputStream(fis);
        
            if (!(dis.readByte() == 0x50 && dis.readByte() == 0x32 && dis.readByte() == 0x42)){
                throw new MojException("narobn format!");
            }
       
            int sirina = dis.readInt();
            int visina = dis.readInt();
           
            for(int piksel = 0; piksel<sirina*visina; piksel++){
                //String r = Integer.toHexString(dis.readByte() & 0xFF);
                //String g = Integer.toHexString(dis.readByte() & 0xFF);
                //String b = Integer.toHexString(dis.readByte() & 0xFF);
                //String rgb = r+g+b;
                
                String rgb = String.format("%02x", dis.readByte() & 0xFF)
                            +String.format("%02x", dis.readByte() & 0xFF)
                            +String.format("%02x", dis.readByte() & 0xFF);
                if(!slovar.containsKey(rgb)) slovar.put(rgb,1);
                else slovar.put(rgb,slovar.get(rgb)+1);
            }

            for(Map.Entry<String,Integer> entry : slovar.entrySet()){
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.printf("%6s: "+value+"\n",key);
            }
            fis.close();
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    
    } 
    
}
