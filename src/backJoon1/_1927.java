package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) {
				q.add(num);
			}else if(q.isEmpty()){
				System.out.println(0);
			}else {
				System.out.println(q.poll());
			}
			
		}

	}
	
	

}
