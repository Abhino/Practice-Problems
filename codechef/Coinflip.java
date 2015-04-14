/*Problem: http://www.codechef.com/problems/CONFLIP*/
import java.io.*;
import java.util.*;
  
class Coinflip {
 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int G = Integer.parseInt(br.readLine());
			while(G-->0)
			{
				String[] ss = br.readLine().split(" ");
				int I=Integer.parseInt(ss[0]);
				int N=Integer.parseInt(ss[1]);
				int Q=Integer.parseInt(ss[2]);
				if(N%2==0)
					pw.println(N/2);
				else
				{
					pw.println(N/2+(I==Q?0:1));
				}
			}
		}
		
		
		
		pw.close();
	}
 
}