package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class _10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(arr);
		
		for(int n = 0; n < num; n++) {
			sb.append(arr[n]).append('\n');
		}
		
		System.out.println(sb);
		

	}

}
