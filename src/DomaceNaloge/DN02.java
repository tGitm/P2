package DomaceNaloge;
public class DN02 {

    public static void main(String[] args) {
        String vnos[] = args;

        if (vnos.length >= 1) {


            if (vnos.length == 1) {
                for (int i = 0; i < vnos[0].length() + 4; i++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("* " + args[0] + " *");

                for (int i = 0; i < vnos[0].length() + 4; i++) {
                    System.out.print("*");
                }
            }
            else {
                for (int i = 0; i < args.length; i++) {

                    for (int j = 0; j < vnos[i].length() + 4; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.println("* " + args[i] + " *");

                    for (int j = 0; j < vnos[i].length() + 4; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
        }
        else {
            System.out.println("Program nima argumentov!");
        }
    }

}
