package reflectionEx;

public class B {
	
	private B() {
		System.out.println("B  zero parameter constant ");
		
	}
	B(int x) {
		System.out.println("B  1 parameter constant ");
		
	}
	int a=90;
	void m1() {
		System.out.println("B -m1");
	}
	int m2() {
		System.out.println("B -m1");
		return 10;
	}

}
