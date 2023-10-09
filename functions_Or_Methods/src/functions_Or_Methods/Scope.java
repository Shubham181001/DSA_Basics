package functions_Or_Methods;

public class Scope {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		
		{//It is called the block.
//			int a = 40;// Since it is initialised in the same method, so you cannot reinitialise it again.
			a = 100;//We cannot re-initialize it but we can modify it.
			int c = 30;//Since it is initialized iside this block, it cannot be used outside this block.
		}
//		System.out.println(c);//Cannot use it here outside this block because it was initialized inside the block.
		System.out.println(a);
	}

}
