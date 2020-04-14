package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw1205 extends Applet {

    TextField input;
    Button doorzoek;
    Integer [] getallen = {1,2,3,4,5};
    Boolean gevonden = false, geklikt = false;
    Integer indexNumber, gegeven;


    public void init() {
        input = new TextField();
        input.addActionListener(new Opnieuw1205.doorzoekAL());
        add(input);

        doorzoek = new Button("Doorzoek");
        doorzoek.addActionListener(new Opnieuw1205.doorzoekAL());
        add(doorzoek);

    }

    public void paint(Graphics g) {

        //Als je if (geklikt = true) gebruikt  dan krijg je het direct op je beeld geprint met waarde Null; waarom? hoe werkt dit?
        if (geklikt) {
            if (gevonden){
                g.drawString("De waarde is gevonden op index nummer "+ indexNumber,50,50);
            } else {
                g.drawString("De waarde is niet gevonden", 50,50);
            }
        }
    }

    class doorzoekAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt = true;
            gevonden = false;
            System.out.println(gevonden + "" + geklikt);
            gegeven = Integer.parseInt(input.getText());

            for (int i = 0; i <= 4; i++) {
                if (getallen[i] == gegeven) {
                    indexNumber = i;
                    gevonden = true;
                    System.out.println("AL SOUT" + indexNumber);
                }
            }
            repaint();
        }
    }


}
