import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;



public class Izpit2ucenje {

    public static void main(String[] args){
        cedeji("dancingQueen.txt", "Knowing Me");

    }

    static void cedeji(String ime1, String ime2){
        ArrayList<String> dat1 = new ArrayList<String>();
        ArrayList<String> dat2 = new ArrayList<String>();
        Map<String, String> skupno = new HashMap<String,String>();

        try{

            Scanner sc = new Scanner(new File(ime1));

            while (sc.hasNextLine()){
                String [] razbito = sc.nextLine().split(";");
                String dolzina = razbito[1].trim();
                String imeFilma = (razbito[0].substring(2, razbito[0].length()).trim());

                skupno.put(imeFilma, dolzina);
                dat1.add(dolzina + " " + imeFilma);
            }

            while (sc.hasNextLine()) {
                String[] razbito = sc.nextLine().split(";");
                String dolzina = razbito[1].trim();
                String imeFilma = (razbito[0].substring(2, razbito[0].length()).trim());

                if (skupno.containsKey(imeFilma)) {
                    if (!(skupno.get(imeFilma).equals(dolzina))) {
                        System.out.println(imeFilma);

                    }

                    dat2.add(dolzina + " " + imeFilma);


                }
            }

        } catch (FileNotFoundException e) {
                System.out.println("File notfound!");
        }

        Collections.sort(dat1);
        Collections.sort(dat2);

        for (String a : dat1){
            System.out.println(a);
        }

        for (String a : dat2){
            System.out.println(a);
        }


    }

    static void okence(){
        JFrame okno = new JFrame("balblabl");
        okno.setSize(500, 300);
        okno.setLocation(500, 500);

        JPanel jp = new JPanel();
        jp.setBackground(Color.DARK_GRAY);

        JButton gumb = new JButton();
        gumb.setText("Obrni");

        JTextField txt1 = new JTextField();
        txt1.setPreferredSize(new Dimension(60, 20));

        JTextField txt2 = new JTextField();
        txt2.setPreferredSize(new Dimension(60, 20));

        gumb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txt2.setText(obrni(txt1.getText()));
                    }
                }
        );

        okno.add(jp);
        jp.add(txt1);
        jp.add(gumb);
        jp.add(txt2);

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true); }

        static String obrni(String niz){
            if (niz.isEmpty()){
                return niz;
            }
            return obrni(niz.substring(1) + niz.charAt(0));
        }


    static void jeznaUrska(String ime1, String ime2){
        try{

            Scanner sc = new Scanner(new File(ime1));

            String [] prva = sc.nextLine().split(" ");
            String format = prva[0];

            int x = Integer.parseInt(prva[1]);
            int y = Integer.parseInt(prva[3]);

            PrintWriter zapisan = new PrintWriter(ime2);

            zapisan.println("G " + x + " x " + y);
            for (int i = 0; i < x*y; i++){
                int r = sc.nextInt();
                int g = sc.nextInt();
                int b = sc.nextInt();
                int grey = (int) (r + g + b/3);

                zapisan.print(grey + " ");
            }

            zapisan.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void vlak(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Vpisi k: "); int k = sc.nextInt();
        System.out.println("Vpisi h: "); int h = sc.nextInt();
        System.out.println("Vpisi m: "); int m = sc.nextInt();

        int startMin = 5*60;
        int ciljMin = 24*60;

        int naslednji = 0;
        for (int i = startMin; i <= ciljMin; i++){
            if (i > h * 60 + m){
                naslednji = i;
                break;
            }
        }

        int naslednjiH = naslednji / 60;
        int naslednjiM = naslednji % 60;

        System.out.println("Prispeli ste: " + h + ":" + m);
        System.out.printf("Naslednji vlak: %02d:%02d \n", naslednjiH, naslednjiM);
    }

}
