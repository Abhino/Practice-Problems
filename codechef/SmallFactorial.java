/*Problem: http://www.codechef.com/problems/FCTRL2*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SmallFactorial {
	
	static int fact(int n)
    {
        int result;

       if(n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }
	
	public static void main(String args[]){
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
			try {
				System.out.println(fact(Integer.parseInt(ob.readLine())));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			t--;
		}
		
	}
}
