/*Problem: https://www.hackerrank.com/challenges/utopian-tree*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UthopianTree {
	
	static int arr[] = new int[61];
	static void createArray(){
		int start = 0;
		for(int i = 0;i<=60;i++){
			if(i%2 == 0)
				start*=2;
			else
				start+=1;
		arr[i]=start;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		createArray();
		int d;
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());		
		for(int i = 0;i<t;i++){
			 d = Integer.parseInt(ob.readLine());		
			 System.out.println(arr[d+1]);
		}
	}

}
