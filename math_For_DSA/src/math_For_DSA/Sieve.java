package math_For_DSA;

// Time for sieve of erasthonese : O(Nlog(logN))
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] primes = new boolean[n + 1];
		sieve_Prime(n, primes);
	}
	
	// false in array means number is prime
	static void sieve_Prime(int n, boolean[] primes) {
		for(int i = 2; i * i <= n; i++) {
			if(!primes[i]) {
				for(int j = i * 2; j <= n; j += i) {
					primes[j] = true;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(!primes[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
