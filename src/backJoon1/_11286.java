package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _11286 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		while(N-- > 0) {
			
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(q.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(q.poll());
				}
			}else {
				q.add(x);
			}
			
		}	
		
	}
	
	
}
