package Java_Opdrachten;

import java.awt.*;
import java.applet.Applet;

public class Hoofdstuk6_1 extends Applet {
    double a;
    double b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a/b);

    }



    public void paint(Graphics g) {
        g.drawString("de uitkomst is: " + uitkomst, 75, 75);




    }



}
