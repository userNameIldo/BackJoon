package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2357 {

	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			sb.append(findMin(arr, num1, num2)).append(" ");
			sb.append(findMax(arr, num1, num2)).append("\n");
			
		}
		System.out.println(sb.toString());
	}
	
	public static int findMin(int[] arr, int num1, int num2) {
		int min = 1000000000;
		for(int i = num1-1; i <= num2-1; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static int findMax(int[] arr, int num1, int num2) {
		int max = 0;
		for(int i = num1-1; i <= num2-1; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
