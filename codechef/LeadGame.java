/*The Lead game problem: http://www.codechef.com/problems/TLG/ */

package codeChef;

import java.util.Scanner;

public class LeadGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0,i,a,b,w = 0,p1 = 0,p2 = 0,maxLead = 0,lead;
		try {
			N = sc.nextInt();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		for(i=0;i<N;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			p1 = p1 + a;
			p2 = p2 + b;
			if(p1>p2){
				lead = p1 - p2;
				if(lead > maxLead){
					maxLead = lead;
					w = 1;					
				}
			}
			else if(p2>p1){
				lead = p2 - p1;
				if(lead > maxLead){
					maxLead = lead;
					w = 2;					
				}
			}
		}
		System.out.println(w+" "+maxLead);
		sc.close();
	}

}
