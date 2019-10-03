package mytp;

public class StaticVar1 {

	static int i=10;
	int b=20;
	
	 static void display() {
		int a=30;
	//	static c=25;   //local variable can not be static
System.out.println(a);
}
	static void show () {
		System.out.println(i); //static member call in static method
		//System.out.println(b); //non-static member can not call in static 
		display();
	}
	{
		display();
	}

	public static void main(String[] args) {
		
		StaticVar1   s=new StaticVar1();
		StaticVar1   s1=null;           //static method can be assessed by nullable  
		s1.show();
		s1.display();
		
	}


}
