package FinalEx;

class FinalEx {
	
	 B b;
	class B{
		 final B b =new B();
	}
	  final int a=10;
	FinalEx(){                       // Constructor  can not be final 
		  
	  }
	 
	   
	 void jbk() {
		 int i=10;
		
		for(i=0;i<=15;i++);
	} 
	 public class F extends FinalEx{
		 void jbk(){
			 System.out.println("555");
			 
		 }
	 }
	 public static void main(String[] args) {
		FinalEx n=new FinalEx();
		F x=n.new F();
		n.jbk();
		x.jbk();
		 
	}

}
