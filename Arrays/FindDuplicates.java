import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicates {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1};
		boolean duplicates = false;
		
		for(int i=0; i<arr.length;i++) {
			for (int j = 0; j < i; ++j) {
	            if (arr[j] == arr[i]) {
	            	duplicates =  true;  
	        }
	    }
	   
			
		}
		
		System.out.println(duplicates);
		
		
	}
	
	

}
