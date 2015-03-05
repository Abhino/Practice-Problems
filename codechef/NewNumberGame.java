/* Problem: http://www.codechef.com/problems/NUMGAME*/
import java.util.Scanner;

public class NewNumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int N;
		for(int i = 0;i<t;i++){
			try{
				N = sc.nextInt();	
				if(N%2 == 0)
					System.out.println("ALICE");
				else
					System.out.println("BOB");
			}
			catch(Exception e){
			}
		}
		sc.close();

	}

}
