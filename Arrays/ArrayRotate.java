import java.util.LinkedList;
import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		LinkedList<Integer> num = new LinkedList<>();
		for (int id: arr) {
			num.add(id);
		}
		System.out.println(num);
		int l = num.size()-1;
		int temp = 0;
		for(int j=0; j<k; j++){
			temp = num.remove(l);
			num.addFirst(temp);
		}

		System.out.println(num);
	}

}
