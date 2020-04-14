package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpnieuwPraktijkopdracht2 extends Applet {
    Button okButton;
    Integer tableNumber = 1;

    public void init() {

        okButton = new Button("OK!");
        okButton.addActionListener(new okBAL());
        add(okButton);
    }

    public void paint(Graphics g) {
        int sommetje;
        int yAs = 0;
        for (int i = 0; i < 11; i++) {
        sommetje = tableNumber * i;
       g.drawString("" + i +"  "+tableNumber+sommetje, 15, yAs);
       yAs += 15;
            System.out.println("in de forloop" + tableNumber);
        }
    }

    class okBAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("okBAL = clicked");
            System.out.println("+" + tableNumber);
        if ( tableNumber > 9) {
            tableNumber = 1;
        }
        else {
            tableNumber++;
        }
        repaint();
        }
        }
    }


