package backJoon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1158 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for(int i = 1; i <= N; i++) {
			
			queue.add(i);
			
		}
		
		while(queue.size() != 1) {
			
			for(int i = 0; i < K-1; i++) {
				int num = queue.poll();
				queue.offer(num);
			}
			
			sb.append(queue.poll() + ", ");
			
		}
		
		sb.append(queue.poll() + ">");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
