
public class SumLogic {
	int c;
int sum(int a, int b){
	 c = a+b;
	return c;
	
}
public static void main (String []as) {
	int a=10;
    int b=20;
    int d,e;
    SumLogic r=new SumLogic();
    d=r.sum(a, b);
    e=d+1;
	System.out.println(e);
	
}
}
