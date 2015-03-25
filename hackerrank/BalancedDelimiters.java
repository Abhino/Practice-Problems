/*Balanced Delimiters problem*/

import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class BalancedDelimiters{

	public static void main(String[] args) throws IOException{
		Stack<Character> st = new Stack<Character>();
		//System.out.println("Stack: "+st);
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		String s = ob.readLine();
		char ch=' ',ch2=' ';
		for(int i = 0;i<s.length();i++){
			ch = s.charAt(i);
			if(ch == '{' ||ch == '['||ch == '(')
				st.push(ch);
			else if(ch == '}'){
				ch2 = st.pop();
				if(ch2 == '{')
					continue;			
			}
			else if(ch == ']'){
				ch2 = st.pop();				
				if(ch2 == '[')
					continue;						
			}
			else if(ch == ')'){
				ch2 = st.pop();				
				if(ch2 == '(')
					continue;			
			}
		}
		if (st.empty()) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}
}