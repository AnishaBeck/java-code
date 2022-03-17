import java.io.*;

 public static void main(String args[])
   {
      int n, num = 1, c, d;
      n = 4;  
      String r = "coza";
      String s = "loza";
      String t = "woza";  
      System.out.println("Floyd's triangle");
      for ( c = 1 ; c <= n ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
           {
              if (num % 3 == 0){
                System.out.print(r+" ");
              num++;
              }
            elif (num % 5 == 0){
                System.out.print(s+" ");
              num++;
            }
            elif (num % 7 == 0){
                System.out.print(t+" ");
              num++;
            }
            elif((num%3==0) || (num%5==0) )
            {
                System.out.print(r+s+" ");
              num++;
            }
             elif((num%3==0) || (num%7==0) )
            {
                System.out.print(r+t+" ");
              num++;
            }
           }
      }
   }




//Program with while loop:
// while (i <= 110)
// {
//     boolean test = fakse;
//     if (i%3 == 0){
//         print
//         test = true;
//     }
//     if (!test){
//         print(i)
//     }
//     print(" ")
//     if (i % 11 == 0)
//     println("")
// }