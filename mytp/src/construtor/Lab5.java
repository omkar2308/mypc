package construtor;

public class Lab5 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();
		Student s2=new Student(102,"kd,kiran@gmai.com",s1.show());
		s2.show();
		Student s3=new Student(103,"kiran-@gmail.com",s2.show(),8265455555L);
		s3.show();
		//s1.show();
	}

}


