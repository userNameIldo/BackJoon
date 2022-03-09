package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _11286_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		        int N = Integer.parseInt(br.readLine());
				
		        PriorityQueue<Integer> p = new PriorityQueue<>((o1, o2) ->
		            Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2))
		        );
				
		        for (int i = 0; i < N; i++) {
		            int x = Integer.parseInt(br.readLine());
					
		            if (x == 0) {
		                if (!p.isEmpty()) {
		                    System.out.println(p.poll());
		                } else {
		                    System.out.println(0);
		                }
		            } else {
		                p.add(x);
		            }
		        }

	}

}
