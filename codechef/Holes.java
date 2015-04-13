/*http://www.codechef.com/problems/HOLES*/

import java.util.Scanner;

class Holes {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int no_of_holes = 0;
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == 'A' || ch == 'D' || ch == 'P' || ch == 'O'
						|| ch == 'Q' || ch == 'R')
					no_of_holes++;
				if (ch == 'B')
					no_of_holes += 2;
			}
			System.out.println(no_of_holes);
			t--;
		}
	}
}
