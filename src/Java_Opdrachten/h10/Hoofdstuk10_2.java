package Java_Opdrachten.h10;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Hoofdstuk10_2 extends Applet {


    TextField tekstvak;
        TextField tekstvak2;
        Label label;
        String tekst;
        int cijfer;
        int cijfer2;



        public void init() {
            tekstvak = new TextField("", 5);
            tekstvak.addActionListener(new TekstVakListener());
            tekst = "";
            tekstvak2 = new TextField("", 5);
            tekstvak2.addActionListener(new TekstVakListener());
            label = new Label("Voer in beide vakken een getal in");
            add(label);
            add(tekstvak);
            add(tekstvak2);
        }



        public void paint(Graphics g) {
            g.drawString(tekst, 50, 50);
        }

        class TekstVakListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s;
                String l;
                s = tekstvak.getText();
                l = tekstvak2.getText();
                cijfer = Integer.parseInt(s);
                cijfer2 = Integer.parseInt(l);
                if (cijfer > cijfer2) {
                    tekst = "Grootste getal = " + cijfer;
                }
                if (cijfer2 > cijfer) {
                    tekst = "Grooste getal = " + cijfer2;
                }
                if (cijfer < cijfer2) {
                    tekst = "Laagste getal = " + cijfer;
                }
                if (cijfer2 < cijfer) {
                    tekst = "Laagste getal = " + cijfer2;
                }
                repaint();
            }
        }
    }

