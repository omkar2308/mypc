package construtor;

public class Student {
	int sid;
	String sname;
	String email;
	long phone;
	void Student() {
		System.out.println("method -student");
	}
	Student(){
		System.out.println("zero parameter");
	}
	Student (int id,String sn,String em){
		System.out.println("3 parameters const");
		sid =id;
		sname=sn;
		email=em;
	}
	Student(int id,String sn, String em,long ph){
		System.out.println("4 parameters const");
		sid =id;
		sname=sn;
		email=em;
		phone=ph;
		
	}String show(){
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(email);
		System.out.println(phone);
		return "JBK";
		
	}
	
}
