/*https://www.hackerrank.com/challenges/is-fibo*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IsFibo {
	
	  public static void main(String[] args) throws NumberFormatException, IOException {
		  List<Long> seri = new ArrayList<Long>();
          int limit = 200;
          long[] series = new long[limit];
          long s;
          series[0] = 0;
          series[1] = 1;
          seri.add(series[0]);
          seri.add(series[1]);          
          for(int i=2; i < limit; i++){
                  series[i] = series[i-1] + series[i-2];
                  seri.add(series[i]);
          }
          BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
          int t = Integer.parseInt(ob.readLine());
          for(int i = 0;i<t;i++){
              s = Long.parseLong(ob.readLine());
        	  if(seri.contains(s))
        		  System.out.println("IsFibo");
        	  else
        		  System.out.println("IsNotFibo");
          }
          
//          System.out.println(seri);
  }

}
