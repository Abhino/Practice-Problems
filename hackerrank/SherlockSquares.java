/*Problem: https://www.hackerrank.com/challenges/sherlock-and-squares*/

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;


class SherlockSquares{

	public static boolean perfectSquare(double n){
		int ogSquare = (int)n;
		double cal = Math.sqrt(n);
		int c = (int)cal;
		if(ogSquare/c == c && ogSquare%c == 0){
			return true;
		}
		else
			return false;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int start,end,count = 0,k=0;
        StringBuffer sb = new StringBuffer();		
		for (int i=0;i<t;i++) {
			start = sc.nextInt();
			end = sc.nextInt();
            int result = (int)(Math.floor(Math.sqrt(end)) - Math.ceil(Math.sqrt(start)) + 1);
            System.out.println(result);
		}
		sc.close();
	}

}