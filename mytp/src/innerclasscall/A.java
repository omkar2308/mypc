package innerclasscall;

public class A {

	
	int a=10;
	int b=20;
//	static class G{            //inner static block no error
//		static int h;
//	}
	
		static void bb() { 
			System.out.println("im in bb method");
			
			
			class C{
			  int d=30;
			  int e=40;
			  
			  
		  
		}
		
	}
	
}
