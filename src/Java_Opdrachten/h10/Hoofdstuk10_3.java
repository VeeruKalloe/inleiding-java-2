package Java_Opdrachten.h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Hoofdstuk10_3 extends Applet{
        TextField tekstvak;
        Label label;
        String s, tekst;
        int dag;


        public void init() {
            Color color = new Color(96, 244, 255);
            setBackground(color);
            tekstvak = new TextField("", 20);
            label = new Label("Voer een nummer van 1 t/m 12 in en druk dan op Enter");
            tekstvak.addActionListener(new TekstVaklistener() );
            tekst = "";
            add(label);
            add(tekstvak);
        }

        public void paint(Graphics g) {
            g.drawString(tekst, 115, 80);
        }


        class TekstVaklistener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                dag = Integer.parseInt(s);
                switch (dag) {
                    case 1:
                        tekst = "Januari, 31 dagen";
                        break;
                    case 2:
                        tekst = "Februari, 28 dagen tenzij het schrikkeljaar is";
                        break;
                    case 3:
                        tekst = "Maart, 31 dagen";
                        break;
                    case 4:
                        tekst = "April, 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei, 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni, 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli, 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus, 31 dagen";
                        break;
                    case 9:
                        tekst = "September, 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober, 31 dagen";
                        break;
                    case 11:
                        tekst = "November, 30 dagen";
                        break;
                    case 12:
                        tekst = "December, 31 dagen";
                        break;
                    default:
                        tekst = "ERROR";
                        break;
                }
                repaint();
            }
        }
    }

