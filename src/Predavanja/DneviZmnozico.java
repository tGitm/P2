package Predavanja;

import java.util.HashSet;
import java.util.Set;

public class DneviZmnozico {
    public static void main(String[] args) {
        //treeset omogoča urejenost elementov, medtem ko v hashsetu so vsi elementi neurejeni
        Set<String> dnevi = new HashSet<>(); //dneve ne rabimo urediti, ker drugače bi jih mogli po vrsti in ne po abecedi

        dnevi.add("PON");
        dnevi.add("TOR");
        dnevi.add("SRE");
        dnevi.add("CET");
        dnevi.add("PET");
        dnevi.add("SOB");
        dnevi.add("NED");

        System.out.println(dnevi.contains("SOB"));
        System.out.println(dnevi.size());

        dnevi.add("SOB");
        dnevi.add("PET");

        System.out.println(dnevi.size()); //duplikate ignorira, torej pe zmeraj set vsebuje 7 elementov

        dnevi.remove("PET");
        System.out.println(dnevi.size());

        for (String dan : dnevi) {
            System.out.println(dan);
        }

    }
}
