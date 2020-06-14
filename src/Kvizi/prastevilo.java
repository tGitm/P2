package Kvizi;

public class prastevilo {
    public static void main(String[] args) {
        System.out.println(jePrastevilo(13));
    }

    static boolean jePrastevilo(int n) {
        if (n <= 1) {
            return false;
        }
        else {
            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0)
                    return false;
                i++;
            }
        }
        return true;
    }
}
