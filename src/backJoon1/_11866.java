package backJoon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		sb.append("<");
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		while(q.size() > 1) {
			for(int i = 0; i < K - 1; i++) {
				int num = q.poll();
				q.add(num);
			}
			sb.append(q.poll() + ", ");		
		}
		sb.append(q.poll() + ">");
		
		System.out.println(sb.toString());
		
	}

}
