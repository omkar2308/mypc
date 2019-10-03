import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {
public static void main(String[] args) {
	
	HashSet<String> hs=new HashSet<String>();
	ArrayList <String> al= new ArrayList(hs);
	hs.add("aaa");
	hs.add("bbb");
	hs.add("ccc");
	hs.add("aaa");   // set can't allowed duplicates
	
	al.add("aaa");
	al.add("bbb");
	al.add("ccc");
	al.add("aaa");
	System.out.println(al.size());
	System.out.println(al);
	/*ArrayList <String> al= new ArrayList(hs);
	System.out.println(al);	*/
	//see size     
	System.out.println(hs.size());
	
	//we can print value for  testing
	System.out.println(hs);
	
	Iterator<String> itr = hs.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next());
	}

	
	
}
}
