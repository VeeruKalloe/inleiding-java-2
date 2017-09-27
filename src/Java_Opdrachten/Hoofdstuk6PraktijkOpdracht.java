package Java_Opdrachten;

import java.awt.*;
import java.applet.Applet;

public class Hoofdstuk6PraktijkOpdracht extends Applet{

    double a;
    double b;
    double c;
    double d;
    double uitkomst;

public void init() {
    super.init();
    a = 5.9;
    b = 6.3;
    c = 6.9;
    d = 3;
    uitkomst = (a + b + c) / d;

}

public void paint(Graphics g) {

    g.drawString("het gemiddelde is:" + uitkomst, 50, 50);
}
}
