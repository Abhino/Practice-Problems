/*Problem: https://www.hackerrank.com/challenges/countingsort1*/
import java.util.Scanner;

class CountingSort{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),elem; 
		int B[] = new int[101];
		for(int i = 0;i<n;i++){
			elem = sc.nextInt();
			B[elem]++;
		}
		for(int i = 0;i<100;i++){
			System.out.print(B[i]+ " ");
		}

		sc.close();
	}
 }