/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * GUI.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
  // inputs
  private Intake loan;
  private Intake payment;
  private Rate interest;
  private JButton button;
  
  // outputs
  private Calc calc;
  private Output payoff;
  private Output cost;

  public GUI() {
    super();
    setLayout(new SpringLayout());

    // instantiate all fields
    loan = new Intake("loan amount");
    payment = new Intake("monthly payment");
    interest = new Rate("interest rate");
    button = new JButton("calculate");
    
    calc = null;// create a new one on button press
    payoff = new Output("months to payoff");
    cost = new Output("cost");
    
    // display setup
    JPanel top = new JPanel(new FlowLayout());
    top.add(loan);
    top.add(interest);
    top.add(payment);

    JPanel center = new JPanel(new FlowLayout());
    center.add(payoff, FlowLayout.CENTER);
    center.add(button, FlowLayout.RIGHT);

    JPanel bottom = new JPanel(new FlowLayout());
    bottom.add(cost, FlowLayout.CENTER);
    
    // create the necessary display
    add(top);
    add(center);
    add(bottom);
    pack();
  }

  public static void main(String[] args) {
    GUI app = new GUI();

    app.setVisible(true);
  }

}
