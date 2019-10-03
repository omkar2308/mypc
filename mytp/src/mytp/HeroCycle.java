package mytp;

abstract class cycle {
	 abstract void work();
	}

	class HeroCycle extends cycle {
	 void work() {
	  System.out.println("Selling good");
	 }
	 
	 public static void main(String argu[]) {
	  cycle o = new HeroCycle();
	  o.work();
	  System.out.println("Code executed");
	 }
	 
	}

	