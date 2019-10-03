package progLogic;

public class Fibonacciex {

	 static int n1=0;
	static int n2=1;
	static int n3=0;
	 
	 static void fibonaccieCount (int c) {
		 
		 if (c>0) {
			 n3=n2+n1;
			 
			 n2=n3;
			 n1=n2;
			 
			 System.out.println( n3);
			 fibonaccieCount (c-1);
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		
		int  c=10;
		
		System.out.println(n1 +" "+n2);
		
		fibonaccieCount(c);
	}
	
	
}
