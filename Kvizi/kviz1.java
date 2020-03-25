import java.lang.Math;

public class kviz1{

    static void java(){
        
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a ");
    }

    static void kalkulator(int a, int b){
       
        if (a == 0 || b == 0 ){
            System.out.println("Napaka: deljenje z 0.");
        }

        else{
        
        int sum = a+b;
        int sub = a-b;
        int zmn = a*b;
        int del = a/b;
        int mod = a%b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " x " + b + " = " + zmn);
        System.out.println(a + " / " + b + " = " + del);
        System.out.println(a + " % " + b + " = " + mod);
        }
    }

    static void krog(double r){

        if (r == 0 || r < 0) {
            System.out.println("Napaka: negativen polmer.");
        }

        double obseg = 2 * Math.PI * r;
        double ploscina =  Math.PI * r * r;

        System.out.println("Obseg = " + obseg);
        System.out.println("Ploscina = " + ploscina);



    }

    static void obsegKroga(double r, int d){

        if (r < 0){
            System.out.println("Napaka: negativen polmer.");
        }else if ( d < 0){
            System.out.println("Napaka: negativen d.");
        }
        
        double obseg = 2 * Math.PI * r;
        double ploscina =  Math.PI * r * r;

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Obseg = " + df.format(obseg));
        System.out.println("Ploscina = " + df.format(ploscina));


    }
    public static void main(String[] args){
       // java();
       //kalkulator(5, 0);
      // krog(7.5);
      obsegKroga(7.5, 3);
    }
} 