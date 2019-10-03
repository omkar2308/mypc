package mytp;

public class ClgMangment {
	private int fees;
	private String name;
	private int  duration;
	public void ClgMangment1(int a,String b,int c) {
		ClgMangment c0=new ClgMangment();
		c0.InsertFees(fees);
		ClgMangment c1=new ClgMangment();
		c1.InsertName(name);
		ClgMangment c2=new ClgMangment();
		c2.InsertDuration(duration);
		
	}

	
	
	private int InsertFees(int a) {
		System.out.println("in fees ");
		return fees;
	}
	
	private String InsertName(String b) {
		System.out.println("in name ");
		return name;
	}
	private int InsertDuration(int c) {
		System.out.println("in duration ");
		return duration;
	}

	
}
