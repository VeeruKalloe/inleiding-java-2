package h04;

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

        setBackground(Color.white);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(130, 130, 160, 160);
        g.drawLine(130, 130, 210, 35);
        g.drawLine(290, 130, 210, 35);
        g.drawRect(150, 245, 30, 45);
        g.drawRect(220, 220, 40, 50);
        g.drawOval(173, 265, 4, 4);
        g.drawRect(150, 170, 35, 35);
        g.drawLine(325, 290, 325, 25);
        g.setColor(Color.red);
        g.fillRect(325, 20, 120, 35);
        g.drawRect(325, 20, 120, 35);
        g.setColor(Color.blue);
        g.fillRect(325, 90, 120, 35);
        g.setColor(Color.BLACK);
        g.drawRect(325, 20, 120, 105);
        g.drawString("Gewicht in kilo", 550, 15);
        g.drawLine(600, 290, 600, 25);
        g.drawLine(600, 290, 900, 290);
        g.drawString("Namen", 910, 295);
        g.drawString("Valerie", 650, 310);
        g.drawString("Jeroen", 750, 310);
        g.drawString("Hans", 825, 310);
        g.drawRect(660, 185, 20, 105);
        g.drawLine(596, 237, 604, 237);
        g.drawLine(596, 184, 604, 184);
        g.drawLine(596, 131, 604, 131);
        g.drawLine(596, 78, 604, 78);
        g.drawLine(596, 25, 604, 25);
        g.drawString("20", 575, 240);
        g.drawString("40", 575, 187);
        g.drawString("60", 575, 134);
        g.drawString("80", 575, 81);
        g.drawString("100", 574, 28);
        g.setColor(Color.green);
        g.fillRect(661, 186, 19, 104);
        g.setColor(Color.BLACK);
        g.drawRect(760, 25, 20, 265);
        g.setColor(Color.blue);
        g.fillRect(761, 26, 19, 264);
        g.setColor(Color.BLACK);
        g.drawRect(835, 80, 20, 210);
        g.setColor(Color.red);
        g.fillRect(836, 81, 19, 209);
        g.setColor(Color.blue);
        g.fillRect(125, 400, 240, 80);
        g.setColor(Color.yellow);
        g.drawOval(140, 415, 200, 40);
        g.fillOval(140, 415, 200, 40);
        g.setColor(Color.black);
        g.fillRoundRect(450, 420, 100, 250, 20, 20);
        g.setColor(Color.red);
        g.fillOval(475, 435, 50, 50);
        g.setColor(Color.orange);
        g.fillOval(475, 510, 50, 50);
        g.setColor(Color.green);
        g.fillOval(475, 585, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRoundRect(600, 450, 150, 150, 20, 20);
        g.fillOval(630, 475, 15, 15);
        g.fillOval(700, 475, 15, 15);
        g.fillOval(630, 550, 15, 15);
        g.fillOval(700, 550, 15, 15);




    }

}

