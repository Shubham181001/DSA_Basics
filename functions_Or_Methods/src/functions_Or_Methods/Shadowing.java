package functions_Or_Methods;

public class Shadowing {

	static int x = 90;//this will be shadowed at line 9
	public static void main(String[] args) {
		System.out.println(x);//90
		int x;//the class variable at line 5 is shadowed by this
//		System.out.println(x);//40 because lower level shadows the upper and higher level
		x = 40;//Upper line was giving an error because x was not initialized.
		System.out.println(x);
		fun();
	}
	
	static void fun() {
		System.out.println(x);
	}
}
