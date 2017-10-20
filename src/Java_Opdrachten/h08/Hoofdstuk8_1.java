package Java_Opdrachten.h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk8_1 extends Applet {
    Label label;
    TextField tekstvak;
    Button knop;
    Button knop1;
    String schermtekst;

    public void init() {
        setSize(500, 450);
        label = new Label("Type iets in het tekstvak, druk dan op OK");
        add(label);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        schermtekst = "";
        knop = new Button("ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);

        knop1 = new Button("Reset");
        KnopListener1 kl1 = new KnopListener1();
        knop1.addActionListener(kl1);
        add(knop1);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            tekstvak.setText("");
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "";
            tekstvak.setText("");
            repaint();
        }
    }
}



