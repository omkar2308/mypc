import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;


public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("101", "java");
		lhm.put("102", ".net");
		lhm.put("101", "c");//duplicate key not allowed it can take latest value 
		//System.out.println(lhm.put("101", "pythan"));
		lhm.put("103", "c");
		
		
		Set s=lhm.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()){
		String key=(String )itr.next();
		System.out.println("key:"+key + "value:"+lhm.get(key) );
		//System.out.println("value:"+lhm.get(key));
		}
		
		
		
	}
}
