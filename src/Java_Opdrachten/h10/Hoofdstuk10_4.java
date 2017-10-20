package Java_Opdrachten.h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class Hoofdstuk10_4 extends Applet {
    TextField tekstvak;
    TextField jaarvak;
    Label label;
    Label labeljaar;
    String s;
    String s2;
    String tekst;
    String tekst2;
    int dag;
    int jaar;

    public void init() {
        Color color = new Color(96, 244, 255);
        setBackground(color);
        tekstvak = new TextField("", 5);
        label = new Label("Type de maandnummer in");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        labeljaar = new Label("Typ het jaar in");
        add(labeljaar);
        tekst2 = "";
        jaarvak = new TextField("", 5);
        jaarvak.addActionListener( new TekstvakListener2());
        add(jaarvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Februari heeft 28 dagen, tenzij het een schrikkeljaar is.";
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "November en deze maand heeft 30 dagen";
                    break;
                case 12:
                    tekst = "December en deze maand heeft 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt!";
                    break;
            }
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = jaarvak.getText();
            jaar = Integer.parseInt(s2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0) {
                tekst2 = tekst2 = "" + jaar + " is een schrikkeljaar.";
            }
            else {
                tekst2 = "" + jaar + " is geen schrikkeljaar.";
            }
            repaint();
        }
    }
}

