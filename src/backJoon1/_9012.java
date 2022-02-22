package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int times = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < times; i++) {
			
			System.out.println(test(br.readLine()));
			
		}
		

	}
	
	public static String test(String st) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < st.length(); i++) {
			
			char c = st.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}else if(stack.empty()) {
				return "NO";
			}else {
				stack.pop();
			}
			
		}
		if(stack.empty()) {
			return "YES";
		}else {
			return "NO";
		}
	
	}

}
