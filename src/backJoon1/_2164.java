package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>(); 
		
		for(int i = 1; i<=N; i++) {
			queue.add(i);
		}
		
		int count = 1;
		while(queue.size() != 1) {
			
			if(count % 2 == 1) {
				int num = queue.poll();
				System.out.println("%2 : " + num);
			}else {
				int num = queue.poll();
				queue.add(num);
				System.out.println("%1 : " + num);
			}
						
		}
		
		System.out.println(queue.poll());
	}

}
