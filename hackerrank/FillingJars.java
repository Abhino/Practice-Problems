import java.util.Scanner;

public class FillingJars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long sum =0,a,b,k;
		for(long i = 0;i<M;i++){
			a = sc.nextLong();
			b = sc.nextLong();
			k = sc.nextLong();
			sum += ((b-a)+1)*k;
		}
		System.out.println(sum/N);
		sc.close();
    }
}