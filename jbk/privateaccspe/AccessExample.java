
public class AccessExample {

	
  	  public static void main (String[]args)
  	  {
  		  AccessDemo ad=new AccessDemo();
  		  ad.testDemo();//private method can not be used 
  		  ad.x=5; //private variable can not be used 
  		  ad.showDemo();
  	  }
    
}
