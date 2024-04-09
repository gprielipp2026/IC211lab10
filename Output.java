/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * Output.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Output extends JPanel{
  private JTextField output;

  public Output(String name) {
    super();
    //Create the intake elements
    JLabel phrase = new JLabel(name);
    output = new JTextField("0.00", 20);
    output.setEditable(false);

    add(phrase);
    add(output);
    //Add the ActionListener

    //Add panel to frame
  }

  // write to the text field
  public void setValue(String value) {
    output.setText(value);
  }
}
