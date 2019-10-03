
 class Sample {
	
	 private int data=40;
	private void msg(){System.out.println("hello java");}

}

 public class A{
 
	public static void main (String[]args){
		Sample obj =new Sample();
		System.out.println(obj.data); //compile time error
		obj.msg(); //compile time error
	}
}
