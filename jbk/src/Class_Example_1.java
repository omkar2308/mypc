
public class Class_Example_1 {

	int a;
	float b;
	String str ;
	 
	public void operation1()
	{
		a=10;
		b=(float)15.26;
		str="java";
	}
	public void operation2()
	{
		a=20;
		b=(float)27;
		str="selenium";
	}
	public void display()
	{
		System.out.println("the integer val is :"+a);
		System.out.println("the float val is :"+b);
		System.out.println("the string val is :"+str);
	}
}
class mainlass{
	public static void main (String args[])
	{
		Class_Example_1 obj=new Class_Example_1();
		obj.operation1();
		obj.display();
		obj.operation2();
		obj.display();
		
	}
}
