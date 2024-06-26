/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * Intake.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Intake extends JPanel{
  private JTextField input;

  public Intake(String name) {
    //Create the intake elements
    super();

    JLabel phrase = new JLabel(name);
    input = new JTextField("0.00", 20);
    input.setEditable(true);

    add(phrase);
    add(input);
    //Add the ActionListener

    //Add panel to frame
  }

  // get the text field value
  public double getValue() {
    try { 
      double val = Double.parseDouble( input.getText() );

      return val;
    } catch (Exception e)
    {
      return 0.00;
    }
  }
}
