import java.util.Scanner;

public class palindromMain 
{

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Eingabe: ");
		String input = Sc.next();
		if(palCheck(input)) {System.out.println("Der eingegeben String '"+input+"' ist ein Palindrom!");}
		else {System.out.println("Der eingegeben String '"+input+"' ist kein Palindrom!");}
	}

	public static boolean palCheck(String input) 
	{
		String viceVersaString = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			viceVersaString = viceVersaString + input.charAt(i); 
		}
		System.out.println(viceVersaString);
		return (viceVersaString.equalsIgnoreCase(input));
	}

}
