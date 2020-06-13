import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Scanner myFile = new Scanner(new File("C:\\Users\\Dilip Kumar\\Music\\data.txt"));
			Scanner myFile = new Scanner (System.in);
			int count =0;
			PrintWriter myFile1 = new PrintWriter(new File("C:\\Users\\Dilip Kumar\\Music\\test.txt"));
			System.out.println("enter data in 5 values: ");
			while (count<=5 ) {
//			System.out.println(myFile.next());
			myFile1.println(myFile.next());
			count++;
			}

			myFile.close();
			myFile1.close();
		}

		catch (FileNotFoundException e) {

		}

	}

}
