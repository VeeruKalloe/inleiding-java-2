package JavaChallenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaChallengeH08 extends Applet{
    TextField textvak;
    TextField textvak2;
    TextField textvak3;
    int Valerie = 60;
    int Jeroen = 80;
    int Hans = 40;

    public void init(){
        setSize(450,400);
        Label valerielabel = new Label("Valerie");
        Label jeroenlabel = new Label("Jeroen");
        Label hanslabel = new Label("Hans");
        textvak = new TextField(5);
        textvak2 = new TextField(5);
        textvak3 = new TextField(5);
        Button knop = new Button("Toon");
        knop.addActionListener(new KnopListener());

        add(valerielabel);
        add(textvak);
        add(jeroenlabel);
        add(textvak2);
        add(hanslabel);
        add(textvak3);
        add(knop);

    }
    public void paint( Graphics g){
        g.drawLine(60, 70, 60, 200);
        g.drawLine(60, 200, 300, 200);


        g.drawLine(55, 180, 65, 180);
        g.drawLine(55, 160, 65, 160);
        g.drawLine(55, 140, 65, 140);
        g.drawLine(55, 120, 65, 120);
        g.drawLine(55, 100, 65, 100);
        g.drawLine(55, 80, 65, 80);


        g.drawString("0",35,200);
        g.drawString("20",35,180);
        g.drawString("40",35,160);
        g.drawString("60",35,140);
        g.drawString("80",35,120);
        g.drawString("100",30,100);
        g.drawString("120",30,80);


        g.drawString("Valerie", 85, 220);
        g.drawString("Jeroen", 165, 220);
        g.drawString("Hans", 245, 220);
        g.setColor(Color.red);
        g.fillRect(80, 200-Valerie,50,Valerie);
        Color color1 = new Color(29, 163, 247);
        g.setColor(color1);
        g.fillRect(160,200-Jeroen,50,Jeroen);
        Color color2 = new Color(6, 165, 51);
        g.setColor(color2);
        g.fillRect(240,200-Hans,50,Hans);
        Color color3 = new Color(107, 40, 239);
        g.setColor(color3);


    }

    class KnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Valerie = Integer.parseInt(textvak.getText());
            Jeroen = Integer.parseInt(textvak2.getText());
            Hans = Integer.parseInt(textvak3.getText());
            repaint();
        }
    }
}
