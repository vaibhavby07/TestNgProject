package zis;

public class Strings
{
	public static void main(String[] args)
 {
		String s1="VELOCITY";
		String s2="velocity";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.startsWith("B"));
		System.out.println(s2.startsWith("W"));
		System.out.println(s1.replace("V","R"));
	}
}
