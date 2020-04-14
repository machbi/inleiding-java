package h12;

import java.applet.Applet;
import java.awt.*;

public class Opnieuw1201 extends Applet {

Double [] getallen = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};


    public void init() {

//        for (int teller = 0; teller < getallen.length; teller++) {
//            getallen[teller] = (int) (Math.random() * 10 + 1);
//            System.out.println("" + getallen[teller]);
//        }
    }

    public void paint(Graphics g) {
double gemiddelde;
//        for (int teller = 0; teller < getallen.length; teller++) {
//            getallen[teller] = (int) (Math.random() * 10 + 1);
//        }
int x = 50;
int y = 50;

        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i], x, y);
            y += 15;
        }
        gemiddelde = (getallen[0] + getallen[1] + getallen[2] + getallen[3] + getallen[4] + getallen[5] + getallen[6] + getallen[7] + getallen[8] + getallen[9]) / 10;
        g.drawString("Het gemiddelde van de array getallen is: " + gemiddelde, 50,215);
    }
}
