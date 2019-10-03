import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListTest {
	
	 public static void main(String args[]){
	 
	  ArrayList <String> al=new ArrayList<String>();
	 //String str="Ravi";
	  al.add("aaa");
	  al.add("Vijay");
	  al.add("Ravi");
	  al.add("Ajay");
	  al.add(null);
	  
	  System.out.println(al.add("dd"));
	  
	  
		//System.out.println(al);  // for testing 
	  
	  		al.size();
	  		System.out.println(al.size()); //see return type of add 
	  
	  		al.isEmpty(); //check ifarray list is empty 
	  
	  		System.out.println("***itration of arrylist by for loop***");
	  
	  for(int i=0; i<al.size();i++){
		  	System.out.println(al.get(i));
	  }
	  System.out.println("***iteration of array list by enhanced for loop***");
	  for(String obj:al)  {
		    System.out.println(obj); }
	  
      		System.out.println("***iteration of array list by ITERATOR***");
      		Iterator itr= al.iterator();
	  while(itr.hasNext()){
		 // Object o=itr.next();
		 // String s= (String) o;
		  System.out.println(itr.next());  //o
	  }
	  	  System.out.println("***iteration of arraylist by listItration ***");
	      ListIterator ltr=al.listIterator();
	  while (ltr.hasNext()){
		  Object o=ltr.next();
	      String s= (String) o;
	      System.out.println(s);
		  
	  }
	 }
	}



