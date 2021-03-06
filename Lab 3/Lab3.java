import java.io.*;
import java. util.*;
import java.lang.Math.*;

public class Lab3
{
  public static void main(String[] args)
  {
    double x, x1, x2;
    double a, b, c;
    double multi;
    String cont = "y";
    
    Scanner keyIn = new Scanner(System.in);
    
    System.out.printf("\n\n\t\tSolve quadratic equation for giving A,B,C coefficient\n");
    while(cont.charAt(0) == 'y' || cont.charAt(0) == 'Y')
    {
      System.out.printf("\n\t\t\tPlease input A: ");
      a = keyIn.nextDouble();
      System.out.printf("\n\t\t\tPlease input B: ");
      b = keyIn.nextDouble();
      System.out.printf("\n\t\t\tPlease input C: ");
      c = keyIn.nextDouble();
      multi = (b*b) - (4*a*c);
      if(a == 0 && b == 0 && c == 0)
      {
        System.out.printf("\n\t\t\tInfinite Solutions.");
        System.out.printf("\n\n\t\t\tDo more (Y/N)? ");
        cont = keyIn.next();
      }
        else if(a == 0 && b!=0 && c!= 0)
        {
          x = -c / b;
          System.out.printf("\n\t\t\tSingle Root. x = %3.2f", x);
          System.out.printf("\n\t\t\tDo more (Y/N)? ");
          cont = keyIn.next();
        }
          else if(a == 0 && b != 0 && c == 0)
          {
            x = c / b;
            System.out.printf("\n\t\t\tSingle Root. x = %3.2f", x);
            System.out.printf("\n\t\t\tDo more (Y/N)? ");
            cont = keyIn.next();
          }
            else if(a == 0 && b == 0 && c!= 0)
            {
              System.out.printf("\n\t\t\tContradict Equation.");
              System.out.printf("\n\t\t\tDo more (Y/N)? ");
              cont = keyIn.next();
            }
      else if(multi > 0)
      {
        x1 = (-b + (Math.sqrt(multi)))/(2.*a);
        x2 = (-b - (Math.sqrt(multi)))/(2.*a);
        System.out.printf("\n\t\t\tTwo real roots, X1 = %3.2f, X2 = %3.2f", x1, x2); 
        System.out.printf("\n\t\t\tDo more (Y/N)? ");
        cont = keyIn.next();
      }
        else if(multi < 0)
        {
          x1 = -b/(2*a);
          x2 = (Math.sqrt(-multi))/(2.*a);
          System.out.printf("\n\t\t\tTwo Complex Roots, X1 = %.3f + %.3fi, X2 = %.3f - %.3fi", x1, x2, x1, x2);
          System.out.printf("\n\t\t\tDo more (Y/N)? ");
          cont = keyIn.next();
        }
          else if(multi == 0)
          {
            x1 = (-b)/(2*a);
            System.out.printf("\n\t\t\tRepeated root, X = %3.2f", x1);
            System.out.printf("\n\t\t\tDo more (Y/N)? ");
            cont = keyIn.next();
          }
    }
  }
}