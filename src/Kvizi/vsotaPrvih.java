package Kvizi;

public class vsotaPrvih {
    public static void main(String[] args) {
        System.out.println(vsotaPrvih(1));
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

    public static int vsotaPrvih(int stevilo) {
        int vsota = 0;
        int dobljenih = 0;
        int i = 2;
        while (i < stevilo) {
            if (jePrastevilo(i)) {
                vsota += i;
                dobljenih++;
            }

            i++;
        }
        return vsota;
    }
}
