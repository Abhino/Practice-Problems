/*Problem: https://www.hackerrank.com/challenges/maximizing-xor*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximizingXOR {

	static int XOR(int num1,int num2){
		return (num1 ^ num2);
	}

    public static void main(String[] args) throws NumberFormatException, IOException{
 		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(ob.readLine());
		int num2 = Integer.parseInt(ob.readLine());
		int max = 0,xor,i,j;
		for(i = num1;i<=num2;i++){
			for(j = num1;j<=num2;j++){
				xor = XOR(i,j);
				if(xor > max)
					max = xor; 
			}
		}
		System.out.println(max);
        
    }
}