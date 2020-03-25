package predavanje2;

public class FormatiranIzpis {

    public static void main(String[] args){
        System.out.printf("Znaki: %c %c %c \n", 'a', 'b', 65 );

        System.out.printf("Cela stevila: %d %d %d \n", 15, 18, 2346863);

        System.out.printf("Realna stevila: %.20f \n", 3.14563958343540685346579885);    //%.20f => zapisi na 20 mest decimalko

        System.out.printf("Znaki: %c %c %c \n", 'a', 'b', 65 );

        System.out.printf("Cela stevila: %7d \n", 15);  //poravnava stevil za odmik = 7
        System.out.printf("Cela stevila: %7d \n", 16);
        System.out.printf("Cela stevila: %7d \n", 17);
        System.out.printf("Cela stevila: %7d \n", 18);

        System.out.printf("Osmiski sistem: %o \n", 100);
        System.out.printf("Sestnajstiski sistem: %x \n", 255);

    }
}
