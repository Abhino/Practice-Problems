/*Problem: https://www.hackerrank.com/challenges/service-lane*/

import java.util.Scanner;

class ServiceLane{

	public static int minArray(int arr[],int low, int high){
		int min = arr[low];
		for (int i = low+1;i<=high;i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++) 
			arr[i] = sc.nextInt();			
		for (int j=0;j<t;j++) {
			int low = sc.nextInt();
			int high = sc.nextInt();
			int min = minArray(arr,low,high);
			System.out.println(min);
		}
		sc.close();
	}
}