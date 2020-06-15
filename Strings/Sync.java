import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Sync HashMap
		
		 Map<Integer, String> syncHashMap = Collections.synchronizedMap(new HashMap<>());
		 syncHashMap.put(1, "Dil");
	     syncHashMap.put(2, "host");
	     syncHashMap.put(3, "Map");
	     System.out.println(syncHashMap.get(1));
        Iterator<Integer> itrat = syncHashMap.keySet().iterator();
        synchronized (syncHashMap) 
        {
            while(itrat.hasNext()) {
                System.out.println(syncHashMap.get(itrat.next()));
            }
        }
        
        
        //Using Concurrent HashMap
        
        ConcurrentHashMap<Integer, String> concHashMap = new ConcurrentHashMap<>();
        concHashMap.put(1, "Dil");
        concHashMap.put(2, "host");
        concHashMap.put(3, "Map");
        concHashMap.get(2);         
        Iterator<Integer> itrat1 = concHashMap.keySet().iterator();
        synchronized (concHashMap) 
        {
            while(itrat1.hasNext()) {
                System.out.println(concHashMap.get(itrat1.next()));
            }
        }

	}

}
