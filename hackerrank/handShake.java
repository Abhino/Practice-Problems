/*Problem: https://www.hackerrank.com/challenges/handshake*/

import java.util.Scanner;

class handShake{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(),inp,out;
		for (int i = 0;i < t ;i++ ) {
			inp = sc.nextInt();
			out = (inp*(inp-1))/2;
			if(out<0)
				System.out.println(0);
			else
				System.out.println(out);
		}
		sc.close();
	}
}