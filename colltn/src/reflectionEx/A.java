package reflectionEx;

import java.lang.reflect.Method;

public class A {
public static void main(String[] args) {
	//first sce. 
	//													Class c=B.class;
	
	//second scenario
	B b=new B(1);
	Class c1=b.getClass();
	
	
	//get all method of class b
	Method[] methodList=c1.getMethods();
	
	for (Method method:methodList){
		System.out.println("method name >>"+ method.getName());
			}
	Method [] methodListAll=c1.getDeclaredMethods();
	for (Method method : methodListAll){
		System.out.println("decleared method name >>"+ method.getName());
	}
}
}
