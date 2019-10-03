package innerclasscall;



public class aa {
	public static void main(String[] args) {
		
	A oc = new A();
    C ic = oc.new C();
		
	A.bb();
		
	C ic = oc.new C();
		
		
		
		//System.out.println(ic.d);
	}

}
