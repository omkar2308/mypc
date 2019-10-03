
public class Lab6 {

	public static void main (String []as) {
		int a=Integer.parseInt(as[0]);
		int b=Integer.parseInt(as[1]);   //run as run cofig
		int min=(a<b) ?a:b;
		int max=(a>b) ?a:b;
		System.out.println("min :: "+min);
		System.out.println("max :: "+max);
		
	}
}
