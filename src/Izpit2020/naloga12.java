package Izpit2020;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class naloga12 {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setLayout(new BorderLayout());

        //elemente sproti dodajam na frame
        JPanel panel = new JPanel();
        okno.add(panel);

        JButton gumb = new JButton("Datum");
        okno.add(gumb);

        JTextField dat = new JTextField(10);
        okno.add(dat);

        JButton gumb2 = new JButton("Barva");
        okno.add(gumb2);

        JTextArea ozadje = new JTextArea();

        okno.add(ozadje);


        //polje za izpis koordinat
        JTextField koor = new JTextField(3);
        okno.add(koor, BorderLayout.PAGE_END);


        //ko se pritisne gumb se izpiše datum
        gumb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd. MM. yyyy");
                String datum = sdf.format(new Date());

                dat.setText(datum);
            }
        });

        Random r = new Random();
        //ko se pritisne gumb se pobarva ozadje
        gumb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
                ozadje.setBackground(c);
            }
        });


        //oknu dodam lastnosti
        okno.setVisible(true);
        okno.setLayout(new FlowLayout(FlowLayout.LEFT));
        okno.setTitle("Okno z datumom in miško");
        okno.setSize(450, 450);
        okno.setResizable(false);
    }
}
