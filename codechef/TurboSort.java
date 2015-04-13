/*Problem: http://www.codechef.com/problems/TSORT*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
public class TurboSort {
    
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int N, i;
		N = Integer.parseInt(ob.readLine());
		int array[] = new int[N];
		for (i = 0; i < N; i++){
			array[i] = Integer.parseInt(ob.readLine());			
		}
		Arrays.sort(array);
		PrintWriter pw = new PrintWriter(System.out);
		for(i = 0; i < N; i++){
		pw.println(array[i]);
		}
		pw.flush();
	}
}