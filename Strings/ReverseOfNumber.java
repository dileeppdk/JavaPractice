import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		long s=scan.nextInt();
		long n=0;
		while( s!=0) {
			n=(n*10)+s%10;
			s=s/10;
		}
		System.out.println("reversed number is :"+n);
		
	        }
}
