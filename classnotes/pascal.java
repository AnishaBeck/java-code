import java.io.*;
public class pascal {

  public static void main(String[] args)
{
    int no_row,c=1,b,i,j;
    no_row = 6;
    for(i=0;i<no_row;i++)
    {
        for(b=1;b<=no_row-i;b++)
        System.out.print(" ");
        for(j=0;j<=i;j++)
        {
            if (j==0||i==0)
                c=1;
            else
               c=c*(i-j+1)/j;
            System.out.print(" "+c);
        }
        System.out.print("\n");
    }
}
}
