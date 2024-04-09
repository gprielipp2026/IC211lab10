/**
 * Prielipp (265112)
 * Schmidt  (265646)
 * Calc.java * * Computes how many months and the total amount paid
 * for an interest amount is going to be
 */
public class Calc {
  // everything to 2 decimal places
  private double amount;
  private double rate; // in % format
  private double payment;

  // output fields
  private int months;
  private double total;

  /**
   * Constructor
   */
  public Calc(double amount, double rate, double payment)
  {
    this.amount = amount;
    this.rate = rate;
    this.payment = payment;
    this.compute();
  }

  /**
   * Calculate how many months and total amount paid will be
   */
  private void compute()
  {
    double amountCopy = amount;

    for(months = 0; amountCopy > 0; months++)
    {
      // interest accrued
      double interest = amountCopy * rate / 1200; // rate in % form
      // payment made
      amountCopy = amountCopy + interest - payment;
    }

    // if amountCopy is negative, it gets repaid to loaner
    total = months * payment + amountCopy - amount;
    total = Math.round(total * 100) / 100.0;
  }

  /**
   * months = <months>  cost = <total>
   *                  ^tab
   */
  public String toString()
  {
    return "months = " + months + "\tcost = " + total;
  }

  /**
   * Get how many months calculated
   */
  public String getMonths() { return String.valueOf(months); }

  /**
   * Get how much it costs
   */
  public String getCost() { return String.valueOf(total); }


  /**
   * Simple test implementation
   */
  public static void main(String[] args)
  {
    if(args.length != 3)
    {
      System.out.println("usage: java Calc <amount> <rate> <payment>");
      System.exit(0);
    }
    double a=0, r=0, p=0;
    try { 
      a = Double.parseDouble(args[0]);
      r = Double.parseDouble(args[1]);
      p = Double.parseDouble(args[2]);
    } catch(Exception e) {
      System.out.println("Need to input floating point numbers for the arguments");
      System.exit(0);
    }
    System.out.println(a + " " + r + " " + p);
    Calc c = new Calc(a,r,p);

    System.out.println(c);
  }

}
