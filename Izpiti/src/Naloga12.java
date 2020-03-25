
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Element  {
    int    vrstnoStevilo;
    String simbol;
    double molskaMasa;

    public Element(int vrstnoStevilo, String simbol, double molskaMasa) {
        this.vrstnoStevilo = vrstnoStevilo;
        this.simbol = simbol;
        this.molskaMasa = molskaMasa;
    }

    @Override
    public String toString() {
        return String.format("%2s Vrstno stevilo: %d, molska masa: %.2f", simbol, vrstnoStevilo, molskaMasa);
    }
}

// TODO: napiši metodo preberiDatoteko()

public class Naloga12 {


    static HashMap<String, Element> preberiDatoteko(String imeDatoteke) {
        HashMap<String, Element> result = new HashMap<>();

        try {

            Scanner sc = new Scanner(new File(imeDatoteke));
            while (sc.hasNextLine()) {
                String prebrano = sc.nextLine();
                String poDelih[] = prebrano.split(" ");

                int vS = Integer.parseInt(poDelih[0]);
                String sim = poDelih[1];
                double mm = Double.parseDouble(poDelih[2]);

                result.put(sim, new Element(vS, sim, mm));
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Napaka pri odpiranju ali branju datoteke!");
        }

        return result;
    }

    public static void main(String[] args) {
        // TODO: preberi in izpiši periodni sistem na
        // dva načina (po abecedi in po naraščajoči
        // molski masi)

        args = new String[]{"elementi.txt", "2"};

        if (args.length < 2){
            System.out.println("Napaka: potrebujem 2 argumenta!");
            System.exit(0);
        }

        String imeDatoteke = args[0];
        String kaj = args[1];

        HashMap<String, Element> elementi = preberiDatoteko(imeDatoteke);
        ArrayList<Element> etts = new ArrayList(elementi.values());

        /*switch (kaj){
            case "1":
                Collection.sort(etts);
                for (Element elt : etts){
                    System.out.println(elt);
                }break;
            case "2":
                Collections.sort(etts, new Comperator<Element>(){
                    public int  compare(Element o1, Element o2){
                        return Double.compare(o1.molskaMasa, o2.molskaMasa);
                }
            });

                for (Element elt : etts){
                    System.out.println(elt);
                }
*/
        }

    }

