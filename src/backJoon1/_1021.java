package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<Integer> q = new LinkedList<>();
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i<=N; i++) {
			q.add(i);
		}
		
		int[] fq = new int[M];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<M; i++) {
			
			fq[i] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 0; i<M; i++) {
			
			int target_Index = q.indexOf(fq[i]);
			int half_Index;
			
			if(q.size() % 2 == 0) {
				half_Index = q.size()/2-1;
			}else {
				half_Index = q.size()/2;
			}
			
			if(target_Index <= half_Index) {
				
				for(int j = 0; j < target_Index; j++) {
					int num = q.pollFirst();
					q.offerLast(num);
					count++;
				}
				
			}else {
				
				for(int j = 0; j < q.size() - target_Index; j++) {
					int num = q.pollLast();
					q.offerFirst(num);
					count++;
				}
				
			}
			q.pollFirst();	
			
		}
		System.out.println(count);	
		
	}

}
