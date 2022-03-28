package backJoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10828 {

	public static int[] arr;
	public static int size = 0;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					System.out.println(pop());
					break;
				case "size":
					System.out.println(size());
					break;
				case "empty":
					System.out.println(empty());
					break;
				case "top":
					System.out.println(top());
					break;
			}
						
		}

	}
	
	public static void push(int num) {
		arr[size] = num;
		size++;
	}
	
	public static int pop() {
		if(size == 0) {
			return -1;
		}else {
			int num = arr[size-1];
			size--;
			return num;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int top() {
		if(size == 0) {
			return -1;
		}else {
			int num = arr[size-1];
			return num;
		}
	}

}
