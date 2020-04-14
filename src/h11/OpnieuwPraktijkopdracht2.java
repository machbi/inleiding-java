package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpnieuwPraktijkopdracht2 extends Applet {
    Button okButton;
    Integer tableNumber;

    public void init() {

        okButton = new Button("OK!");
        okButton.addActionListener(new okBAL());
        add(okButton);
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int sommetje;
        tableNumber = 0; // hier zet je tableNumber op 0, dus is ie altijd 0 als je het scherm gaat tekenen
        for (int i = 1; i < 11; i++) {
        sommetje = tableNumber * i;
       g.drawString("" + sommetje, x, y);
       y += 15;
       tableNumber++;
            System.out.println("" + tableNumber);
        }
    }

    class okBAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        if ( tableNumber >= 9) {
            tableNumber = 1;
        }
        else {tableNumber++;
        }
            repaint();
        }
        }
    }


