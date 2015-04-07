/*Problem: https://www.hackerrank.com/challenges/song-of-pi*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class songofpi{
	public static void main(String[] args) throws IOException{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int piArr[] = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,3};
		int t = Integer.parseInt(ob.readLine());
		for (int j=0;j<t;j++) {
			int countWord = 0,arrCount = 0,flag = 0;
			String str = ob.readLine();
			String[] splited = str.split("\\s+");
			for (int i=0;i<splited.length;i++) {
				int len = splited[i].length();
				if (len != piArr[countWord]) {
					flag++;
					break;
				}
				else
					countWord++;
			}
			if(flag == 0)
				System.out.println("It's a pi song.");
			else
				System.out.println("It's not a pi song.");			
		}
	}
}