package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1918 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> s = new Stack<>();
		
		char[] c = br.readLine().toCharArray();
		
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] >= 'A' && c[i] <= 'Z') {
				sb.append(c[i]);
			}else {
				
				if(c[i] == '(') {
					
					s.push(c[i]);
					
				}else if(c[i] == ')') {
					
					while(!s.empty()) {
						
						sb.append(s.pop());
						
					}
					if(!s.empty())
						s.pop();
				}else {
															
					while(!s.empty()) {
						sb.append(s.pop());
					}
					
				}
			}
			
			
		}
		
		
		
		
	}

}
