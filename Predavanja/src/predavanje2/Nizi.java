package predavanje2;

public class Nizi {

    public static void main(String[] args){
        String niz = "Pomlad prihaja";

        //dolzina niza
        int dolzina = niz.length();
        System.out.println(dolzina);

        //izpis znaka na dolocenem mestu niz.charAt(3)
        char znak = niz.charAt(3);
        System.out.println(znak);

        //izpis podniza
        System.out.println(niz.subSequence(0, 5));

        //kje v nizu se pojavi crka p
        System.out.println(niz.indexOf("p"));
        System.out.println(niz.indexOf("x"));   //odgovor bo -1, ker ne obstaja

        //zamenja a-je, z x-i
        String novNiz = niz.replaceAll("a", "x");
        System.out.println(novNiz);

        // primer if stavka
        int a = 3;
        int b = 5;

        if (a == b){
            System.out.println("Vrednosti sta enaki.");

        }else{
            System.out.println("Vrednosti nista enaki.");
        }

        //primer if stavka z stringi
        String n1 = "Java";
        String n2 = "Java";

        if (n1.equals(n2)){          //operator == se pri nizih ne sme nikoli uporabljati!!
            System.out.println("Vrednosti sta enaki.");

        }else{
            System.out.println("Vrednosti nista enaki.");
        }


    }
}
