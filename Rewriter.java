/*****************************
 * MIDN SCHMIDT 265646
 * MIDN PRIELIPP 265112
 * Lab 10
 * Rate.java
 ****************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rewriter {

  public static String rewrite(String way, String val) {
    String res;
    if (way.equals("original"))
      res = val;
    else if (way.equals("allcaps"))
      res = val.toUpperCase();
    else if (way.equals("alllower"))
      res = val.toLowerCase();
    else {
      String[] A = val.split(" ");
      res = A[0].toLowerCase();
      for(int i = 1; i < A.length; i++)
	res += A[i].substring(0,1).toUpperCase() +
	  A[i].substring(1).toLowerCase();
    }
    return res;
  }

  public static void main(String[] args) {
    String x = "This is very cool";
    System.out.println(rewrite("original",x));
    System.out.println(rewrite("allcaps",x));
    System.out.println(rewrite("alllower",x));
    System.out.println(rewrite("camelCase",x));
  }
}