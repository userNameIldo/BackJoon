package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10816_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[N];  
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
		
			int num = Integer.parseInt(st.nextToken());			
			
			sb.append((upperBound(arr1, num) - lowerBound(arr1, num)) + " ");
			
		}
		
		System.out.println(sb.toString());

	}
	
	public static int lowerBound(int[] arr, int num) {
		
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			
			int mid = (low+high)/2;
			
			if(num <= arr[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
			
		}
		
		return low;
		
	}
	
	public static int upperBound(int[] arr, int num) {
		
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			
			int mid = (low+high)/2;
			
			if(num < arr[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
			
		}
		
		return low;
		
	}


}
