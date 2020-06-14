package Kvizi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class RandomGui {

        public static void main(String [] args){
            System.out.println();

            JFrame window = new JFrame();

            window.setLayout(new FlowLayout(FlowLayout.CENTER));
            JTextField besedilo1TF = new JTextField(12);
            JTextField besedilo2TF = new JTextField(12);
            JButton gumb = new JButton("OBRNI");

            window.add(besedilo1TF);
            window.add(gumb);
            window.add(besedilo2TF);


            window.setTitle("Naslov");
            window.setLocation(500,500);
            window.pack();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            window.setResizable(true);

            gumb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        String beseda = besedilo1TF.getText();
                        StringBuilder bes = new StringBuilder(beseda);
                        besedilo2TF.setText(String.valueOf(bes.reverse()));
                    } catch (Exception ex) {
                        throw new Napaka();
                    }
                }
            });

        }
    }

    class Napaka extends RuntimeException{
        public String getMessage(){
            return "Vpisana  je napacna vrednost";
        }
    }