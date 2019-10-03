import java.util.Hashtable;


public class HasTableTest {
public static void main(String[] args) {
	
	Hashtable ht=new Hashtable();
	
	ht.put("ind", "indian");
	ht.put("bhu", "bhutan");
	ht.put("ind", "csk");
	
	System.out.println("size of hashtable is:"+ht.size()); //print size by ignoring duplicates key
	
	//ht.put(null, "india"); //cpmtime on  runtm not ok 
	
	//ht.put(null, null); //cpmtime on  runtm not ok
	
	ht.put("ind", null);  //cpmtime on  runtm not ok null value also cant take 
	
	
	
	
}
}
