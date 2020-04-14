package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class OpnieuwPraktijkopdracht12 extends Applet {
Button okKnop;
TextField inputGebruikersnaam, inputTelefoon;
Label gebruikersnaamLabel, telefoonnummerLabel;
Boolean geklikt = false;
String [] gebruikersnamen = new String[10];
Integer [] telefoonnummers = new Integer[10];
Integer index = 0;

    public void init() {
        inputGebruikersnaam = new TextField("", 25);
        inputGebruikersnaam.addActionListener(new okBAL());
        gebruikersnaamLabel = new Label("Typ hier de gewenste gebruikersnaam in");
        add(gebruikersnaamLabel);
        add(inputGebruikersnaam);

        inputTelefoon = new TextField("", 25);
        inputTelefoon.addActionListener(new okBAL());
        telefoonnummerLabel = new Label("Typ hier het bijbehorende telefoonnummer");
        add(telefoonnummerLabel);
        add(inputTelefoon);


        okKnop = new Button("OK");
        okKnop.addActionListener(new okBAL());
        add(okKnop);

    }

    public void paint(Graphics g) {
        if (geklikt){
            g.drawString("" + Arrays.toString(gebruikersnamen),15,140);
            g.drawString("" + Arrays.toString(telefoonnummers), 15, 155);

        }
    }

    class okBAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        if (index < 10){
            gebruikersnamen[index] = inputGebruikersnaam.getText();
            telefoonnummers[index] = Integer.parseInt(inputTelefoon.getText());
            System.out.println(gebruikersnamen[index]);
           index++;
        } else{
            geklikt = true;

        }
            System.out.println(Arrays.toString(gebruikersnamen));
            repaint();
        }
    }

}
