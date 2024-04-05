/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * GUI.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    Strip s1 = new InTake("Loan Amount ");
    Strip s2 = new Rate("Interest Rate ");
    //Not really intake, need to add new class
    Strip s3 = new Intake("Monthly Payment ");
    
    Strip s4 = new InTake("Months to Pay off ");
    Strip s5 = new Intake("Cost ");
    f.add(s1, BorderLayout.NORTH);
    f.add(s2, BorderLayout.NORTH);
    f.add(s3, BorderLayout.NORTH);
    f.add(s4, BorderLayout.CENTER);
    f.add(s5, BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}