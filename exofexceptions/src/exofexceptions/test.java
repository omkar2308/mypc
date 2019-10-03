package exofexceptions;

public class test {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			
			e.printStackTrace();// Complete error message 
			System.out.println(e.toString());//short error message
			System.out.println(e.getMessage());//get only message
		}
	}

}
