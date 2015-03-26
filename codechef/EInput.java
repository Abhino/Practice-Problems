/*Problem: http://www.codechef.com/problems/INTEST*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class EInput {

	public static void main(String[] args) {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int k,n,c=0,temp = 0;
		n = sc.nextInt();
		k = sc.nextInt();
		while(n!=0){
			try {
				temp = Integer.parseInt(ob.readLine());
				if(temp % k == 0)
					c++;				
				n--;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		System.out.println(c);
	}

}
