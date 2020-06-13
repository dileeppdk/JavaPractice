import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String st = "JAVA DEMO";
		System.out.print("Enter string to reverse:");
	     Scanner read = new Scanner(System.in);
		 String str = read.nextLine();
		 String reverse= "";
		
		for(int i= str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		
		System.out.println("Reversed String is:" + reverse +".");
	}

}
