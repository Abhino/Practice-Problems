/*Problem: http://www.codechef.com/problems/HS08TEST*/

import java.util.Scanner;

class Transaction {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int wid = sc.nextInt();
		Double bal = Double.parseDouble(sc.next());		
		if((wid%5==0)&&(bal-wid>=0.5))
			System.out.printf("%.2f",bal-wid-0.5);
		else
			System.out.printf("%.2f",bal);
	}
}
