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
  
  private class EventListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      onUpdate();
    }
  }

  private class Exiter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }

  // update/calculate interest, months, total cost
  private void onUpdate() {
    double amt = loan.getValue();
    double rate = interest.getValue();
    double pay = payment.getValue(); 

    if (amt <= 0 || pay <= 0)
    {
      // set cost and payoff to "" and return
      cost.setValue("");
      payoff.setValue("");
      return;
    }

    // computes in the constructor
    // amount of months and total cost
    calc = new Calc(amt, rate, pay);

    cost.setValue(calc.getCost());
    payoff.setValue(calc.getMonths());
  }

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
    setLayout(new GridLayout(3,1));

    // instantiate all fields
    loan = new Intake("loan amount");
    payment = new Intake("monthly payment");
    interest = new Rate("interest rate");
    button = new JButton("calculate");
    button.addActionListener(new EventListener());
    
    calc = null;// create a new one on button press
    payoff = new Output("months to payoff");
    cost = new Output("cost");
    
    // display setup
    JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
    top.add(loan);
    top.add(interest);
    top.add(payment);

    JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER));
    center.add(payoff);
    center.add(button);

    JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
    bottom.add(cost);
    
    // create the necessary display
    add(top);
    add(center);
    add(bottom);

    setLocation(100,100);
    
    addWindowListener(new Exiter());

    pack();
  }

  public static void main(String[] args) {
    GUI app = new GUI();

    app.setVisible(true);
  }

}
