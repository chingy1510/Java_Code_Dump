public class AllFunctions
{
  public double mySin(double x)
  {
    double sign = 1.;
    double sum = 0.;
    int    i, y;
    
    for(i = 0; i <= 21 ; i++)
    {
      y = (2 * i) + 1;
      sum = sum + (sign * doWork(x, y));
      sign = -sign;
    }
    return(sum);
  }
  public double myCos(double x)
  {
    double sign = 1;
    double sum = 1.;
    int    i, y;
    
    for(i = 1; i <= 21 ; i++)
    {
      y = 2 * i;
      sum = sum - (sign * doWork(x, y));
      sign = -sign;
    }
    return(sum);
  }
  public double myExp(double x)
  {
    double sign = 1.;
    double sum = 1.;
    int    i, y;
    
    for(i = 1; i <= 21 ; i++)
    {
      y = i;
      sum = sum + doWork(x, y);
    }
    return(sum);
  }
  public double doWork(double x, double y)
  {
    double temp, bot, top, mult;
    for(top = 1., bot = 1., temp = 1. ; y > 0 ; y--)             
    {
      top = x;
      bot = y;
      mult = top/bot;
      temp = temp * mult;
    }
    return temp;
  }
    public static void printIt(int x[], int size)
  {
    int i;
    
    for(i = 0 ; i < size; i++)
      System.out.printf("%d,", x[i]);
  }
  public static void sortIt(int x[], int size)
  {
    int i, temp, flag = 0;
    int d = size / 2;
    
    while(d > 0)
    {
      for(i = 0; i < (size - d); i++)
      {
        if(x[i+d] < x[i])
        {
          temp = x[i+d];
          x[i+d] = x[i];
          x[i] = temp;
          flag = 1;
        }
      }
      if(flag == 0)
        d = d / 2;
      else
        flag = 0;
    }
  }
  public static void searchIt(int x[], int a)
  {
    int first, last, middle;
    
    first  = 0;
    last   = 20;
    middle = (first + last) / 2 ;
    
    while(first <= last)
    {
      if(x[middle] < a)
        first = middle + 1;
      else if(x[middle] == a)
      {
        System.out.printf("\n\t\t%d is found at position %d", a, middle + 1);
        break;
      }
      else
        last = middle - 1;
      middle = (first + last) / 2;
    }
    if(first > last)
      System.out.printf("\n\t\t%d is not found.", a);
  }
}

      
}