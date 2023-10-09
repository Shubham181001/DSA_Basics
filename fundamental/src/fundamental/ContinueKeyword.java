package fundamental;

public class ContinueKeyword {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		while(i<=n)
		{
			i++;
			if(i==4)
			{
				continue;//skips the all other statement that is in the loop and continues to execute from next iteration.
			}
			System.out.println(i);
		}
	}

}
