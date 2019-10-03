
public class A {

	B m1(){
		System.out.println("im in A -m1");
		//return new B();
		
		B b=new B();
		return b;
	}
	public static void main(String []args){
		A a=new A();
		a.m1();
		B b= a.m1();
		b.m6();
		
	}
	
	
}
