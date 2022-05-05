public class Test2
{
public static void main(String args[])
	{
		String s1=new String("CHRISTUNIVERSITY");
		String s2=new String("CHRISTUNIVERSITY");
		System.out.println(s1==s2);

		String s3="CHRISTUNIVERSITY";
		System.out.println(s1==s3);

		String s4="CHRISTUNIVERSITY";
		System.out.println(s3==s4);

		String s5="CHRIST"+"UNIVERSITY";
		System.out.println(s4==s5);

		String s6="CHRIST";
		String s7=s6+"UNIVERSITY";
		System.out.println(s4==s7);

		final String s8="CHRIST";
		String s9=s8+"UNIVERSITY";
		System.out.println(s4==s9);   
    }
}
