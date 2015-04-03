/*Project Euler:https://www.hackerrank.com/contests/projecteuler/challenges/euler001*/
import java.util.Scanner;
class Multiples{
	public static long SumOfNumber(long N){
    N--;
	long div3 = N/3;
	div3 = (div3 * (div3 + 1) /2)*3;

	long div5 = N/5;
	div5 = (div5 * (div5 + 1) /2)*5;

	long div15 = N/15;
	div15 = (div15 * (div15 + 1) /2)*15;
	
	return div3 + div5 - div15;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for (long i=0;i<t;i++) {
			long n = sc.nextLong();
			System.out.println(SumOfNumber(n));			
		}
		sc.close();
	}
}