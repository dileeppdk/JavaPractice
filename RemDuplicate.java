import java.util.Arrays;
import java.util.Scanner;

public class RemDuplicate {

	public static int remduplicates(int arr[], int n) {
		// TODO Auto-generated method stub

		//if array length is 0 then return o
		if (arr.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		
		  int arr[] = {1, 2, 3, 3, 6, 6, 6, 8, 8, 0}; 
		  Arrays.sort(arr);
		  int n = arr.length;
		  
		  n = remduplicates(arr, n);
		  
		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
