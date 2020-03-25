import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FisDis {


    public static void Capona(String imeDatoteke) {


    FileInputStream fis = null;
    DataInputStream dis = null;


    try{

        fis = new FileInputStream(imeDatoteke);
        dis = new DataInputStream(fis);

        int rez = 0;
        int maxNakup = 0;

        while (dis.available() > 0) {
            int a = dis.readInt();
            rez += a;
            if (a < 0 && a < maxNakup) maxNakup = a;
        }

        dis.close();
        System.out.println("Stanje: " + rez +"€");
        System.out.println("Največji nakup: " + maxNakup +"€");

    }
    catch (java.io.IOException e){
        e.printStackTrace();
    }
    }
}

