package h04;//Voorbeeld 4.1

import java.applet.Applet;
import java.awt.*;

public class H4PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 175, 50);
        g.drawString("lijn", 110, 65);
        g.drawRect(50,150, 250, 150);
        g.drawString("rechthoek", 135, 320);
        g.setColor(Color.pink);
        g.fillRect(325, 150, 250, 150);
        g.setColor(Color.BLACK);
        g.drawOval(325, 150, 250, 150);
        g.drawString("Gevulde rechthoek", 401, 325);
        g.drawOval(600, 150, 250, 150);
        g.fillArc(620, 150, 200,123, 45, 90);
        g.drawRoundRect(50, 350, 250, 150, 20, 20);
        g.drawString("Afgeronde rechthoek", 100, 525);
        g.setColor(Color.pink);
        g.fillOval(325, 350, 250, 150);
        g.setColor(Color.BLACK);
        g.drawOval(650, 350, 175, 175);
        g.drawString("gevulde ovaal", 400, 525);
        g.drawString("cirkel", 725, 540);






    }
}