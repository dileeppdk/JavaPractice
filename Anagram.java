import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String1");
		System.out.println("Enter String2");
		
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		System.out.println(anagramCheck(string1, string2));
		
	}
 public static boolean anagramCheck(String string1, String string2) {
			char[] charStr1 = string1.toCharArray();
			char[] charStr2 = string2.toCharArray();
			Arrays.sort(charStr1);
			Arrays.sort(charStr2);
			
			return Arrays.equals(charStr1, charStr2);
			
		}
		
	

}
