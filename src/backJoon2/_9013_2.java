package backJoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _9013_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Stack<String> s = new Stack<>();
		
		for(int i = 0; i < N; i++) {
			String st = br.readLine();
			
			for(int j = 0; j < st.length(); j++) {
				char c = st.charAt(j);
				
				if(c == '(') {
					s.push("(");
				}else {
					if(s.empty()) {
						sb.append("NO");
					}else {
						s.pop();
					}
				}
				
			}
			if(sb.length() == 0) {
				if(s.empty()) {
					sb.append("YES");
				}else {
					sb.append("NO");
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
		
		

	}

}
