import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Enter input string");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		String revString = "";
		for(int i=inputString.length()-1;i>=0;i--) {
			revString = revString + inputString.charAt(i);
		}
		
		if(inputString.equals(revString)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}

}
