package Kvizi;

public class Rotiraj {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6};

    }

    private static void rotiraj(int [] tabela, int k) {
        for (int i = 0; i < k; i++) {
            //zacasna tabela
            int temp = tabela[0];
            for (int x = 0; x < tabela.length - 1; x++) {
                tabela[x] = tabela[x + 1];
            }
            tabela[tabela.length - 1] = temp;

            }
        }
}

