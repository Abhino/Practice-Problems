/**
http://www.codechef.com/APRIL12/problems/DOUBLE
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleString {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(ob.readLine());
		int i,l;
		for(i=0;i<N;i++){
			l = Integer.parseInt(ob.readLine());
			  if(l%2==0)
			    System.out.println(l); 
			  else
			    System.out.println(l-1);  
			}
	}

}
