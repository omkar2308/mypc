import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class PropertiesTest {
	public static void main(String[] args) {
		
		Properties properties =new Properties(); 
		//method of this class r synchronized so it is thread safe class 
		
		//puting elements
		properties.put("101", "java");
		properties.put("104", "c");
		properties.put("103", "c++");
		properties.put("102", ".NET");    //ordering key with decending 
		
		//properties.put(null,null);    //null not allowed
		
		System.out.println(properties);
		//to retrive elements
		Set s= properties.keySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()){
			System.out.println(properties.get((String)itr.next()));
			
			
			// to store in xml file 
			
			try{
				FileOutputStream fout=new FileOutputStream("F:\\jbk.xml");
				properties.storeToXML(fout, "key-value pair");
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
