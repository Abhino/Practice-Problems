/*http://www.codechef.com/problems/REMISS*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Reminess {
 
	public static void main(String[] args) {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int k,n,c=0,temp = 0;
		n = sc.nextInt();
		while(n!=0){
			try {
				k = sc.nextInt();
				temp = sc.nextInt();				
				c = k+temp;
				System.out.println(Math.max(k, temp) + " " + c);
				n--;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
 
}