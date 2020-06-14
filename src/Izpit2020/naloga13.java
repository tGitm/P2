package Izpit2020;

public class naloga13 {
    public static void main(String[] args) {
        System.out.println(popraviBesedilo(args[0]));
    }

    public static String popraviBesedilo(String besedilo) {
        String [] novo = new String[besedilo.length()];
        //splitam črko po črko, da jih lahko spodaj primerjam
        String [] split = besedilo.split("");

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < besedilo.length(); i++) {
            novo[i] = split[i];
            //če sta prejšnji niz in naslednji enaka appendam samo prejšnjega
            if (novo[counter].equals(novo[counter++])) {
                sb.append(novo[counter]);
            }
            //drugače appendam i-ti niz
            else {
                sb.append(novo[i]);
            }
            counter++;
        }
        return sb.toString();
    }
}
