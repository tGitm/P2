import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Planet{
    String ime;
    int radij;

    public Planet(String ime, int radij){
        this.ime = ime;
        this.radij = radij;

    }

    double povrsina(){
        return 4*Math.PI*radij*radij;
    }

}

public class DN08 {

    public static void main(String[] args) throws FileNotFoundException {
        args = new String[] {"viri/planeti.txt", "Pluton+Mars"};

        Planet [] planeti = new Planet[10];
        int i = 0;

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String prebrano = sc.nextLine();
            String[] deli = prebrano.split(" ");

            if (deli.length == 2){
                planeti[i++] = new Planet(deli[0], Integer.parseInt(deli[1]));
            }
        }
        sc.close();

        String poizvedba = args[1];
        String[] deliPoizvedba = poizvedba.split("[+]");

        double vsota = 0;

        for(int k = 0; k < deliPoizvedba.length; k++){
            int p = -1;
            for (int j = 0; j < i; j++){
                if (planeti[j].ime.equalsIgnoreCase(deliPoizvedba[k])) {
                    p = j;
                }
                if (p != -1 ){
                    vsota += planeti[p].povrsina();
                }
            }
            System.out.printf("Povrsina planetov \"%s\" je %.0f milijonov km2\n", poizvedba, vsota/1000000);
        }
    }
}
