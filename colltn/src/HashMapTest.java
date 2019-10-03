import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapTest {
	public static void main(String[] args) {
		
		//creation of hashmap 
		HashMap hm =new HashMap();
		
		//adding element with key 
		hm.put("101", "c");
		//System.out.println(hm); to check only 
		hm.put("102", ".net");
		hm.put("101", "c++");
		
		//will print null 
		Object o= hm.put("104", "c1");  //new key104 will print null 
		System.out.println(o);
		
		Object o2= hm.put("104", "c++"); //duplicate key will print previeas value
		System.out.println(o2);

		Object o1= hm.put("101", "c");
		System.out.println(o1);
		
		Object o3= hm.put("105", "c++");// duplicate value allowed /new key prt null 
		System.out.println(o3);
		
		//retriving elements from hashmap by  using itrator 
		System.out.println("-----by  using itrator------");
		
		Set s=hm.keySet(); // set s cointains all keys 
		
		Iterator itr =s.iterator();
		while (itr.hasNext()){
			String key= (String)itr.next();
			System.out.println("key "+ key);
			System.out.println("value"+ hm.get(key));
			}
		  //retriving elements from hashmap by  using //map.Entry 
		System.out.println("\n---- by  using  Map.Entry------");
		//get a set of entries 
		Set set=hm.entrySet();
		//get a itrator 
		Iterator it= set.iterator();
		// display elements
		while(it.hasNext()){
			Map.Entry me=(Map.Entry) it.next();
			System.out.println(me.getKey() +" ");
			System.out.println(me.getValue()+" ");
		}
		
		

		
		
		
	}

}
