package mytp;

public class StaticBlocklab2 {
	public StaticBlocklab2() {
		System.out.println("this is costructer...");
	}
	{
		System.out.println("this is non static block ");
	}
	static {
		System.out.println("this is static block..... ");
	}
	public static void main(String[] args) {
		StaticBlocklab2 s=new StaticBlocklab2();
		StaticBlocklab2 s1=new StaticBlocklab2();  /*static block can be executed ones
		                                              when class is loaded */
	}
}
