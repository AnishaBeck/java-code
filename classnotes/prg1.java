// import java.io.*;
public class sleepin{
public static boolean sleepintrouble(boolean weekday, boolean vacation)
{
if (weekday || !vacation)
	return(true);
	System.out.println("I am sleeping!");
else
	return(false);
	System.out.println("I am not sleeping!");

}
}


public static void main(String [] a) 
{
boolean as, bs;
as = true;
bs = false;
sleepin s = new sleepin();
System.out.println(s.sleepintrouble);
}