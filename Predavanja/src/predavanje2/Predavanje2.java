package predavanje2;

public class Predavanje2 {

    static void trikotnik(int odmik, int visina){
        for (int i=0; i<visina; i++){
            for (int j=0; j<odmik+visina-i-1;j++) System.out.print(" ");
            for (int j=0; j<2*i+1;j++) System.out.print("*");
            System.out.println();
        }

    }

    public static void main(String[] args){
        trikotnik(5, 8);
    }
}
