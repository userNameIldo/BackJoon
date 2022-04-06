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
		
		int back = 0;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				
			case "push":
				back = Integer.parseInt(st.nextToken());
				q.add(back);
				break;
			case "pop":
				if(q.isEmpty()) 
					System.out.println(-1);
				else
					System.out.println(q.poll());
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(q.size()==0)
					System.out.println(-1);
				else
					System.out.println(q.peek());
				break;
			case "back":
				if(q.size()==0)
					System.out.println(-1);
				else
					System.out.println(back);
				break;
			}
			
			
		}
		
		
	}
	
	
}
