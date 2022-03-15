package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _2504 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] c = br.readLine().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		int result = 1;
		
		for(int i = 0; i < c.length; i++) {
			
			if(c[i] == '(') {
				stack.push(c[i]);
				result *= 2;
			}else if(c[i] == '['){
				stack.push(c[i]);
				result *= 3;
			}else {
				
				if(c[i] == ')') {
					
					if(stack.empty() || stack.peek() != '(') {
						result = 0;
					}else {
						
					}
					
				}
				
				
			}
			
		}

	}

}
