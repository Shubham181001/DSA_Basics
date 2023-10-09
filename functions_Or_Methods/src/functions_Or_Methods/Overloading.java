package functions_Or_Methods;

public class Overloading {

	public static void main(String[] args) {
		fun(67);
		fun("Shubham");
	}
	//for function overloading it is necessary to have either different number of arguments
	//Or different data-type of arguments if the number of argument is same.
	static void fun(int a) {
		System.out.println(a);
	}
	
	static void fun(String name) {//Here in this case the number of argument is the same but the type of the argument is different. one is of integer type and another one is of String type
		System.out.println(name);
	}
}
