package Java_Opdrachten;

import java.awt.*;
import java.applet.Applet;

public class Hoofdstuk6_3 extends Applet {
     int positiefgetal1;
     int positiefgetal2;
     int uitkomst;

     public void init() {
                super.init();
                positiefgetal1 = 2147483;
                positiefgetal2 = 1;

                uitkomst = (positiefgetal1 + positiefgetal2);

     }

            public void paint(Graphics g) {
                g.drawString("De uitkomst is: " + uitkomst, 20, 20);
            }
 }

