package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opnieuw1203 extends Applet {
TextField [] tekstvakken = new TextField[5];
String [] eindproduct = new String[5];
Button oK;

    public void init() {
        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("" + i);
            add(tekstvakken[i]);
        }
        oK = new Button("OK!");
        oK.addActionListener(new oKBAL());
        add(oK);
    }


    class oKBAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvakken.length; i++) {
        eindproduct[i] = tekstvakken[i].getText();
            }
        Arrays.sort(eindproduct);
            for (int i = 0; i < tekstvakken.length; i++) {
                tekstvakken[i].setText(String.valueOf(eindproduct[i]));
                repaint();
            }

        }
    }

}
