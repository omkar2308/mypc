package mytp;

//An example to show that interfaces can
//have methods from JDK 1.8 onwards
interface in2
{
 final int a = 10;
   static void display() //Default //in JDK 8 is that we can now define static methods in interfaces
 {
     System.out.println("hello");
 }
}

//A class that implements interface.
class TestClass1 implements in2
{
 // Driver Code
 public static void main (String[] args)
 {
	 TestClass1 t = new TestClass1();
    // t.display();
	 in2.display();
 }
}
