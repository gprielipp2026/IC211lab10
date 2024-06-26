/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * Rate.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rate extends JPanel {
  private String val;
  private JLabel lab;
  private JComboBox<Double> cbox;

  private class Selector implements ActionListener {
    public void actionPerformed(ActionEvent e) { update(); }
  }
  
  public Rate(String sin) {
    super(new FlowLayout());
    val = sin;
    lab = new JLabel(val);

    Double[] options ={3.50, 3.75, 4.00, 4.25, 4.50, 4.75, 5.00, 5.25, 5.50, 5.75, 6.00, 6.25, 6.50, 6.75, 7.00, 7.25, 7.50}; 

    cbox = new JComboBox<Double>( options );
    cbox.addActionListener(new Selector());
    add(lab);
    add(cbox);
  }

  public double getValue() {
    int i = cbox.getSelectedIndex();
    double val = cbox.getItemAt(i);
    return val;
  }
  
  public void update() {
    //int i = cbox.getSelectedIndex();
    //double way = cbox.getItemAt(i);
    //lab.setText(Rewriter.rewrite(way,val));
  }
}
