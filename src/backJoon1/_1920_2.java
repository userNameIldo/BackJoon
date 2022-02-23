package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920_2 {

		public static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			
			if(binarySearch(Integer.parseInt(st.nextToken())) != -1){
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			
		}
		
	}
	
	public static int binarySearch(int num) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid = (high + low)/2;
			
			if(num < arr[mid]) {
				high = mid - 1;
			}else if(num > arr[mid]) {
				low = mid + 1;
			}else {
				return mid;
			}
			
		}
		
		return -1;
	}

}
