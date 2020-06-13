import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public class MyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		numbers.add(1);
	    numbers.add(32);
	    numbers.add(32);
	    numbers.add(99);
	    numbers.add(99);
	    
	    numbers.add(4);
	    numbers.remove(0);
	    
	    for(int i=0; i<numbers.size(); i++) {
			for(int j=0; j<numbers.size(); j++) {
			if(i!=j && numbers.get(i).equals(numbers.get(j))) {
				numbers.remove(j);
	    
			} 
			}
			
	    }
	    
	    System.out.println(numbers);
	    
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("India", "New Delhi");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("India"));
	    
	    CopyOnWriteArrayList<String> nums = new CopyOnWriteArrayList<>();
	    nums.add("I");
	    nums.add("am");
	    nums.add("Dileep"); 
	    
	    System.out.println(nums);

	

			
	}
}
