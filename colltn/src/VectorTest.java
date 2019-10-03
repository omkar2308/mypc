import java.util.Enumeration;
import java.util.Vector;


public class VectorTest {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.size());
		System.out.println(v.capacity());
		//we can change default behaviour 
		Vector v1=new Vector(2);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		//now try adding elements 
		v1.add("apple");
		v1.add("mango");
		v1.add("grapes");
		System.out.println(v1.size());
		System.out.println(v1.capacity()); //observe capacity 
		
		//iterate by using enumeration 
		Enumeration enumeration=v1.elements();
		while (enumeration.hasMoreElements()) {
			String elements = (String) enumeration.nextElement();
			System.out.println(elements);
			
		}
		
		
	}
}
