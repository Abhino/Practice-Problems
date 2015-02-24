/**
 * Problem: For a given N, calculate sum of all numbers which are less than N
 * and divisible by 3 or 5
 * */
public class DivisibilitySum {

	public static void sumDivisible(int N){
		N--;
		int div3 = N/3;
		div3 = ((div3*(div3 + 1))/2)*3;
		int div5 = N/5;
		div5 = ((div5*(div5 + 1))/2)*5;
		int div15 = N/15;
		div15 = ((div15*(div15 + 1))/2)*15;
		int sum = div3 + div5 - div15; 
		System.out.println(sum);
	}
	public static void main(String args[]){
		sumDivisible(15);
	}
}
