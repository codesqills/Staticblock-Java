package staticblock;

class A{
	static{
		System.out.println("A class static block");
	}
	public A(){
		this(10);
		System.out.println("0 arg constructor");	
	}
	public A(int a){
		System.out.println("1 arg constructor");
	}
	{
		System.out.println("A block instance block");
	}
}
public class StaticBlock4 {

	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block 1");
		{
			System.out.println("instance block 2");
		}
	}
	public StaticBlock4(){
		System.out.println("0 arg constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticBlock4();
		System.out.println("*******");
		new StaticBlock4();
		System.out.println("*******");
		new A();
		System.out.println("*******");
	}

}
