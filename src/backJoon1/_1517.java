package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1517 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		int count = 0;
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i<N-1; i++) {
			
			for(int j = i + 1; j < N; j++) {
				
				if(arr[i] > arr[j]) {
					count++;
				}
				
			}
			
		}
		
		System.out.println(count);	

	}

}
