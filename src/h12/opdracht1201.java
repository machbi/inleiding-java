package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht1201 extends Applet {

int [] cijfers;

int x;
int y;
int gemiddelde;

    public void init() {

        cijfers = new int[5];

        for (int i = 0; i < 5; i++) {
            cijfers[i] = (int) (Math.random() * 10 + 1);
            System.out.println(cijfers[i] + "-");
        }


    }


    public void paint(Graphics g) {

        x = 50;
        y = 50;

        for (int i = 0; i < cijfers.length; i++) {
         g.drawString(" " + cijfers[i], x, y);
         x += 15;
         gemiddelde = (cijfers[0] + cijfers [1] + cijfers [2] + cijfers [3] + cijfers [4]) / 5;
//         g.drawString(" Het gemiddelde is: " + gemiddelde,50,65);
        }

        g.drawString(" Het gemiddelde is: " + gemiddelde,50,65);
    }





}
