


package mytp;
class Parent {
	public void work() {
  System.out.println("Parent is under retirement from work.");
 }
}
  
class child extends Parent {
	@Override
 public void work() {
  System.out.println("Child has a job");
  System.out.println(" He is doing it well");
  Parent p=new Parent();
  p.work();
  
 }

}