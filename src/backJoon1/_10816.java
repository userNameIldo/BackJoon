package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[N];  
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int count = 0;
			int num = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < N; j++) {
				if(num == arr1[j]) {
					count++;
				}
			}
			
			sb.append(count + " ");
			
		}
		System.out.println(sb.toString());
	}

}
