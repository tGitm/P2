package predavanje5;

/**
 *
 * @author Tim
 */
public class StringBuffer {
    
    //metoda vrne string sestavljen iz n-besed "abrakadabra"
    static int getDolgStringIzStringBufferja(int n){
        StringBuffer result = new StringBuffer("");
        for (int i=0; i<n; i++){
            result.append("abrakadabra");
        }
        return result;
    }
    
    public static void main(String[] args){
        /* a = "ponedeljek";
        //String a = new String("ponedeljek");
        
        StringBuffer sba = new StringBuffer("ponedeljek");
        System.out.println(sba);
        System.out.println(sba.charAt(3));
        */
        
        int n = 1000;
//        long zacetek = System.currentTimeMillis();
//        
//        String r1 = getDolgString(n);
//        long konec = System.currentTimeMillis();
//        System.out.println((konec-zacetek) + "ms");
        
        long zacetek = System.currentTimeMillis();
        String r2 = getDolgStringIzStringBufferja(n);
        long konec = System.currentTimeMillis();
        System.out.println((konec-zacetek) + "ms");
    }
}
