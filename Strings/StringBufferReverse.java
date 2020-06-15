import java.util.Scanner;

public class StringBufferReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the String:");
		Scanner sbr = new Scanner(System.in);
		String str = sbr.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println("Reversed string is:" + sb.reverse().toString());
		 
	}

}
