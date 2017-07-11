/*
 * static variable
 * 
 */
package staticblock;

public class StaticBlock3 {
	
	public static int a;
	static {
		a=10;
		StaticBlock3 obj1=new StaticBlock3();
		display();
	}

	static void display(){
		System.out.println(StaticBlock3.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	}

}
