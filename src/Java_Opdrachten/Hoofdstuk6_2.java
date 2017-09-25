package Java_Opdrachten;

import java.awt.*;
import java.applet.Applet;

public class Hoofdstuk6_2 extends Applet {

    double seconden;
    double uur;
    double dag;
    double jaar;
    double uitkomst1;
    double uitkomst2;
    double uitkomst3;

    public void init() {
        super.init();
        seconden = 60;
        uur = 3600;
        dag = 86400;
        jaar = 1314000;
        uitkomst1 = (seconden * 60);
        uitkomst2 = (uur * 24);
        uitkomst3 = (dag * 365);
    }

    public void paint(Graphics g) {

        g.drawString("er zitten" + uitkomst1, 20, 20);
        g.drawString("seconden in 1 uur", 120, 20);

        g.drawString("er zitten" + uitkomst2, 20, 40);
        g.drawString("seconden in 1 dag", 125, 40);

        g.drawString("er zitten" + uitkomst3, 20, 60);
        g.drawString("seconden in 1 jaar", 140, 60);


    }


}


