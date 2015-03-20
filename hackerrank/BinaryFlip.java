import java.util.Scanner;

public class BinaryFlip {

	public static String padStr(String str, String pad, int len) {
	  while (str.length() < len)
	    str = pad + str;
	  return str;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s;
		for (int k=0;k<t;k++) {
			Long x = sc.nextLong();		
			String parse = Long.toBinaryString(x);
			parse = padStr(parse, "0", 32);		
			char a[] = parse.toCharArray();
			int len = a.length;
			for(int i = 0;i<len;i++){
				if(a[i]=='1')
					a[i]='0';
				else
					a[i]='1';
			}
			String newParse = new String(a);
			System.out.println(newParse);
			long result = Long.parseLong(newParse,2);	
			System.out.println(result);
		}
	}
}
