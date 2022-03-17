import java.io.*;

class floyd
{
   public static void main(String args[])
   {
      int n, num = 1, c, d;
      n = 4;    
      System.out.println("Floyd's triangle");
      for ( c = 1 ; c <= n ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
           {
              System.out.print(num+" ");
              num++;
           }
          System.out.println();
      }
   }
}