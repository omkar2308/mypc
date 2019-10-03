package exofexceptions;

public class exexp1 {
	
	public static void main(String[] args) {
		
		doStuff();
	
		System.out.println("111");
		System.out.println("222");
		//int a= 10/0;
		System.out.println("333");
		System.out.println("444");
		System.out.println(10/0);
		
	}
	public static void doStuff() {
		domoreStuff();
		System.out.println("222");
		
	}
	private static void domoreStuff() {
		  System.out.println("666");
		
	}

}
