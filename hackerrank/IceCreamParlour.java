/*Problem: https://www.hackerrank.com/challenges/icecream-parlor*/
import java.util.Scanner;

class IceCreamParlour{

	static void printIndices(int A[],int m){
		int len = A.length;
		for (int i=0;i<len-1;i++) {
			for (int j=i+1;j<len;j++ ) {
				if (A[i]+A[j]==m) {
					System.out.println((i+1)+" "+(j+1));
					break;
				}
			}
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,m,n;
		t = sc.nextInt();
		for (int k=0;k<t;k++) {
			m = sc.nextInt();				
			n = sc.nextInt();
			int A[] = new int[n];
			for (int i=0;i<n;i++)
				A[i] = sc.nextInt();
			printIndices(A,m);			
		}
		sc.close();
	}
}