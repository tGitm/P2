import javax.swing.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;

public class Gui2 {

    public static void GUI() {


        JFrame okno = new JFrame("Bojči okno!");
        okno.setSize(600, 300);
        okno.setLocation(500, 500);

        Map<String, Integer> slovar = new HashMap<>();

        JTextArea jta = new JTextArea();
        okno.add(jta);

        jta.addMouseMotionListener((MouseMotionAdapter) mouseMoved(e) {
            String koor = String.format("(%d, %d)", e.getX(), e.getY());

            if (slovar.containsKey(koor)) {
                slovar.put(koor, slovar.get(koor) + 1);
            } else {
                slovar.put(koor, 1);
            }

            jta.setText("Koordinata " + koor + " je bila obiskana " + slovar.get(koor) + "-krat\n");
        }
        );

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}
