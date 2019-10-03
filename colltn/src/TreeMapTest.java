import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapTest {
	public static void main(String[] args) {
		
		TreeMap tm=new TreeMap();  //is sorted n ordered in assending 
		
		tm.put("103", "java");
		tm.put("102", ".net");
		Object o=tm.put("101", "c++");
		System.out.println(o); //will print null 
		
		Object o1=tm.put("101", "c");
		System.out.println(tm);
		System.out.println(o1);
		
		System.out.println("iterating");
		
		Set s=tm.keySet();
		Iterator itr= s.iterator();
		while (itr.hasNext()){
		String key =(String)itr.next();
		System.out.println("key"+ key);
		System.out.println("value"+ tm.get(key));
		
		}
		
	}

}
