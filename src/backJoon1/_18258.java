package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _18258 {

	public static int[] arr = new int[2000000];
	public static int frontq = 0;
	public static int backq = 0;
	public static int size = 0;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static void push(int num) {
		arr[backq] = num;
		backq++;
		size++;
	}
	

	public static void pop() {
		
		if(size == 0) {
			sb.append(-1).append('\n');
		}else {
			int num = arr[frontq];
			size--;
			frontq++;
			sb.append(num).append('\n');
		}
	}
	
	public static void size() {
		sb.append(size).append('\n');
	}
	
	
	public static void empty() {
		if(size == 0) {
			sb.append(1).append('\n');
		}else {
			sb.append(0).append('\n');
		}
	}
	
	public static void front() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}else {
			sb.append(arr[frontq]).append('\n');
		}
	}
	
	public static void back() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}else {
			sb.append(arr[backq-1]).append('\n');
		}
	}

}
