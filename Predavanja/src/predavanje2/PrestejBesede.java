package predavanje2;

public class PrestejBesede {

    static int steviloBesed(String[] besede, char z){
        int b = 0; //stevilo besed, ki se zacne na 0

        for (int j = 0; j < besede.length; j++){
            if (besede[j].charAt(0) == z){      //primerjam prvi crki
                b = b + 1;
            }
        }
        return b;
    }

    public static void main(String[] args){
        String[] besede = new String[4];

        besede[0] = "lipa";
        besede[1] = "javor";
        besede[2] = "jesen";
        besede[3] = "breza";

        int stBes = steviloBesed(besede, 'j');
        System.out.println(stBes);

        String[] besede2 = new String[] {"prva", "druga", "tretja", "cetrta"};  //hkratna inicializacija in deklaracija
        System.out.println(steviloBesed(besede2, 'p'));



    }
}
