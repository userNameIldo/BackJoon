package backJoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _10845 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int M[] = new int[N];
		
		Queue<Integer> q = new LinkedList<>();
		
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				
			case "push":
				q.add(st.nextToken());
			
			}
			
			
		}
		
		
	}
	
	
}
