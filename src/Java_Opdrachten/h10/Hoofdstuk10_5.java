package Java_Opdrachten.h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk10_5 extends Applet {

    TextField tekstvak;
    int aantal;
    String s;
    String aangever;
    double gemiddelde;
    double totaal;
    double invoer;


    public void init() {
        tekstvak = new TextField("", 7);
        tekstvak.addActionListener(new VeldListener());
        add(tekstvak);

        aantal = 0;
        gemiddelde = 0.0;
        totaal = 0.0;
        aangever = "";
    }


    public void paint(Graphics g) {

        g.drawString("" + aangever, 50, 80);
        g.drawString("Het gemiddelde cijfer is: " + gemiddelde, 50, 100);
        g.drawString("Aantal cijfers: " + aantal, 50, 120);

    }

    class VeldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            invoer = Double.parseDouble(s);

            aantal++;
            totaal = invoer + totaal;
            gemiddelde = totaal / aantal;


            if (invoer >= 5.5) {
                aangever = "Voldoende :)";
            } else
                aangever = "Onvoldoende ;(";

            tekstvak.setText("");
            repaint();

        }
    }
}