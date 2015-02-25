package careercup;

/**Given an Array of integers and a number find first two numbers the two 
elements that add up to it*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumArray {

	private int array[];
	private int length;
	private static ArrayList<Integer> pair = new ArrayList<Integer>();
	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public int maxPair(int arr[], int num){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]+arr[j]<num)
					continue;
				else if((arr[i]+arr[j])==num){
					pair.add(arr[i]);
					pair.add(arr[j]);
					return 0;
				}
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		SumArray s = new SumArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i<N;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the Number for two elements to add up to: ");
		int num = sc.nextInt();
		s.sort(arr);
		s.maxPair(arr,num);
		System.out.println(pair);
		sc.close();
	}
}
