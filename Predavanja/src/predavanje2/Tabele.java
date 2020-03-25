package predavanje2;

public class Tabele {

    public static void main(String[] args){
        //deklaracija tabele       ==> tip [] ime_tabele; int [] stevilka; String [] nizi;

        int [] stevila;  //samo deklaracija
        stevila = new int[10];  //ustvarim tabelo velikosti 10
        System.out.println(stevila.length);

        stevila[5] = 3;
        System.out.println(stevila[5]);


    }
}
