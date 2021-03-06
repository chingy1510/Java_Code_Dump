
import java.util.*;

class Lab2
{
  public static void main(String[] args)
  {
    int deci; 
    double temp, outTemp;
    String cont = "y";
   
    Scanner keyIn = new Scanner(System.in);
    while(cont.charAt(0) == 'y' || cont.charAt(0) == 'Y')
    {
      System.out.printf("\n\t\tRelationship between Fahrenheit and Celsius");
      System.out.printf("\n\n\t\t\t    1)     F  - >  C");
      System.out.printf("\n\t\t\t    2)     C  - >  F");
      System.out.printf("\n\n\t\t\tChoice (1/2) ? ");
      deci = keyIn.nextInt();
      if(deci == 1 && deci != 2)
      {
        System.out.printf("\n\n\t\t\tInput F: ");
        temp = keyIn.nextDouble();
        outTemp = (5.0/9.0) * (temp - 32.0);
        System.out.printf("\n\n\t\t\t%6.2fF = %6.2fC", temp, outTemp); 
        System.out.printf("\n\n\t\t\tDo More (Y/N) ? ");
        cont = keyIn.next();
      }
      if(deci == 2 && deci != 1)
      {
        System.out.printf("\n\n\t\t\tInput C: ");
        temp = keyIn.nextDouble();
        outTemp = ((9.0/5.0) * (temp)) + 32.0;
        System.out.printf("\n\n\t\t\t%6.2fC = %6.2fF", temp, outTemp); 
        System.out.printf("\n\n\t\t\tDo More (Y/N) ? ");
        cont = keyIn.next();
      }
      if(deci != 2 && deci != 1)
      {
        System.out.printf("\t\t\t!!!!Invalid input. Retry!!!!");
      }
    }
    keyIn.close();
  }
}

