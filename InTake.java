/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * Intake.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InTake extends JPanel{
    private JTextField input;

    public InTake(String name) {
        //Create the intake elements
        JLabel phrase = newJLabel(name);
        input = new JTextField("0.00", 20);
        input.setEditable(true);

        
        //Add the ActionListener

        //Add panel to frame
    }
}