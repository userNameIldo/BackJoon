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
		
		int result = 0;
		int count = 1;
		
		for(int i = 0; i < c.length; i++) {
			
			if(c[i] == '(') {
				stack.push(c[i]);
				count *= 2;
			}else if(c[i] == '['){
				stack.push(c[i]);
				count *= 3;
			}else {
				
				if(c[i] == ')') {
					
					if(stack.empty() || stack.peek() != '(') {
						result = 0;
						break;
					}else {
						if(c[i-1] == '(') {
						result += count;
						count = count/2;
						stack.pop();
						}else {
							count = count/2;
							stack.pop();	
						}						
					}
					
				}else if(c[i] == ']'){
					
					if(stack.empty() || stack.peek() != '[') {
						result = 0;
						break;
					}else {
						if(c[i-1] == '[') {
							result += count;
							count = count/3;
							stack.pop();
							}else {
								count = count/3;
								stack.pop();	
							}					
					}
					
				}else {
					result = 0;
					break;
				}
			}
			
		}if(!stack.empty()) {
			result = 0;
		}
		System.out.println(result);
	}

}
