package recursion;

public class Concept {

	public static void main(String[] args) {
		fun(5);
	}
	
	static void fun(int num) {
		if(num == 0) {
			return;
		}
		
		System.out.println(num);
		fun(--num) ;
	}
}
