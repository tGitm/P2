import java.io.File;
import java.util.Scanner;

interface Lik {

    public double povrsina();
}

class Kvadrat implements Lik {
    int a;

    public Kvadrat(int a){
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a * a;
    }
}

class Krog implements Lik {
    double r;

    public Krog(double r){
        this.r = r;
    }

    @Override
    public double povrsina() {
        return Math.PI * r * r;
    }
}

class Pravokotnik implements Lik {
    int a, b;

    public Pravokotnik(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }
}

public class DN10 {
    private static final int N = 100; //ajvečje fiksno določeno število likov!

    public static void main(String[] args) throws Exception{
        Lik liki[] = new Lik[N];
        int no = 0;

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()){
            String[] deli = sc.nextLine().split(":");

            if (deli.length < 2) continue;

            liki[no++] = new Pravokotnik(Integer.parseInt(deli[1]), Integer.parseInt(deli[2]));

        }
        sc.close();
        //izračunam površino vseh likov v zgornji tabeli
        double vsota = 0;
        for (int i = 0; i< no; i++){
            vsota += liki[i].povrsina();
        }
        //izpišem skupno površino vseh likov izmoje tabele
        System.out.printf("Skupna površina vseh planetov je: %.2f", vsota);

    }
}
