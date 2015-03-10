/*Problem : https://www.hackerrank.com/challenges/maxsubarray*/
/*Solved using Kadane's Algo*/
import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgo {
	
	public static boolean containAllNegative(int[] A){
		for(int i=0;i<A.length;i++)
			if(A[i]>=0)
				return false;
		return true;
	}
	
	public static int maxSubArray(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			max = Math.max(max, newsum);
		}
		return max;
	}
	
	public static int maxArraySum(int[] A){
		int sum = 0;
		if(containAllNegative(A)){
			Arrays.sort(A);
			sum = A[A.length - 1];
			return sum;
		}
		else{
			for(int i = 0;i<A.length;i++){
				if(A[i]>=0)
					sum +=A[i];
			}
			return sum;					
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int N,max,sum;
		for(int i=0;i<t;i++){
			N = sc.nextInt();
			int arr[] = new int[N];
			for(int j = 0;j<N;j++)
				arr[j]=sc.nextInt();
			max = maxSubArray(arr);
			sum = maxArraySum(arr);
			System.out.println(max+" "+sum);
		}
		sc.close();		
	}

}
