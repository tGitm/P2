package Predavanja;

public class Rekurzija {

    public static void main(String[] args) {
        jePalindromR("cepec");
    }

    static boolean jePalindromR(String niz) {
        if (niz.length() <= 1) return true;

        char prva = niz.charAt(0);
        char zadnja = niz.charAt(niz.length()-1);
        String sredina = niz.substring(1, niz.length() - 1); //substrin gre vključno z prvim in izključi zadnjega

        return ((prva == zadnja) && jePalindromR(sredina));
    }


}
