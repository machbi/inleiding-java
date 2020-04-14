package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw1206 extends Applet {
Integer [] array = {2,1,2,1,1};
Integer gegeven, aantalKeer = 0;
TextField userInput;
Button okButton;
Boolean gevonden = false;

    @Override
    public void init() {
        userInput = new TextField("");
        userInput.addActionListener(new okBAL());
        add(userInput);

        okButton = new Button("OK!");
        okButton.addActionListener(new okBAL());
        add(okButton);
    }

    @Override
    public void paint(Graphics g) {
        if (gevonden){
            g.drawString("Het getal " + gegeven + " is " + aantalKeer + " keer gevonden.",50,50);
            aantalKeer = 0;
        }
    }

    class okBAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("okBAL werkt");
    gegeven = Integer.parseInt(userInput.getText());

            for (int i = 0; i < array.length; i++) {
                if (gegeven == array[i]){
                    aantalKeer++;
                    gevonden = true;
                }
            }
            System.out.println("" + aantalKeer);
            repaint();
        }
    }


}
