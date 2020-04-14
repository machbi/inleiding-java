package h12;

import java.applet.Applet;
import java.awt.*;

public class Opnieuw1202 extends Applet {
Button [] knoppen = new Button[25];
Button knop;
    public void init() {
        for (int i = 0; i < knoppen.length; i++) {
            knoppen[i] = new Button("" + i);
            add(knoppen[i]);
        }
    }

    public void paint(Graphics g) {
    }



}
