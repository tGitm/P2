import java.util.HashMap;


// Razred ElementA, ki je definiran spodaj, je popolnoma enak razredu Element, ki smo ga 
// definirali v razredu Naloga12. Da bi preprečili konflikt imen, smo razred v tej nalogi
// poimenovali ElementA. 
class ElementA  {
    int    vrstnoStevilo;
    String simbol;
    double molskaMasa;

    public ElementA(int vrstnoStevilo, String simbol, double molskaMasa) {
        this.vrstnoStevilo = vrstnoStevilo;
        this.simbol = simbol;
        this.molskaMasa = molskaMasa;
    }

    @Override
    public String toString() {
        return String.format("%2s Vrstno stevilo: %d, molska masa: %.2f", simbol, vrstnoStevilo, molskaMasa);
    }
}


public class Naloga13 {

    // Poenostavljena rešitev "branja iz datoteke" - uporabno le za potrebe te naloge
    // (pravilno branje se implementira tako, kot je opisano v nalogi 2).
    // Za pravilno delovanje programa Naloga13 te metode ni potrebno spreminjati.
    static HashMap<String,ElementA> preberiDatoteko(String imeDatoteke) {
        HashMap<String,ElementA> result = new HashMap();

        result.put("H",  new ElementA(1, "H", 1.008));
        result.put("C",  new ElementA(6, "C", 12.011));
        result.put("O",  new ElementA(8, "O", 15.999));
        result.put("Cu", new ElementA(29,"Cu",63.546));
        result.put("Cl", new ElementA(17,"Cl",35.45));
        result.put("S",  new ElementA(16,"S", 32.06));
        result.put("F",  new ElementA(9, "F", 18.998));

        return result;
    }

    static double molskaMasa(HashMap<String,ElementA> elementi, String spojina) {
        double result = 0;

        for (int i = 0; i< spojina.length(); i++) {
            String simbol = spojina.charAt(i) + "";

            if (i < spojina.length() - 1 && Character.isDigit(spojina.charAt(i + 1)))
                simbol += spojina.charAt(i + 1);

            int stevilo = 1;

            if (i < spojina.length() - 1 && Character.isDigit(spojina.charAt(i + 1)))
                stevilo = Integer.parseInt(spojina.charAt(++i) + "");


            if (elementi.containsKey(simbol)) {
                result += stevilo*elementi.get(simbol).molskaMasa;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("!!!!!!Napaka: potrebujem 2 argumenta!!!!!!");
            System.exit(0);
        }

        String imeDatoteke = args[0];
        String spojina     = args[1];

        HashMap<String, ElementA> elementi;
        elementi = preberiDatoteko(imeDatoteke);

        System.out.printf("Molska masa spojine %s je %.2f\n", spojina, molskaMasa(elementi, spojina));
    }
}
