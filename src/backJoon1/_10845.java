package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10845 {

	public static int[] queue;
	
	public static int size = 0;
	public static int back = 0;
	public static void push(int num) {
		
		queue[size] = num;
		size++;
		
	}
	
	public static int pop() {
		
		if(size() == 0) {
			return -1;
		}else {
			int num = queue[back];
			back++;
			return num;
		}
	}
	
	public static int size() {
		return size-back;
	}

	public static int empty() {
		if(size() == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front() {
		if(size() == 0){
			return -1;
		}else {
			return queue[back];
		}
	}
	
	public static int back() {
		if(size() == 0){
			return -1;
		}else {
			return queue[size-1];
		}
	}
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int times = Integer.parseInt(br.readLine());
		StringTokenizer st;
		queue = new int[times];
		
		for(int i = 0; i < times; i++) {
		
			st = new StringTokenizer(br.readLine(), " ");
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
				case "front":
					System.out.println(front());
					break;
				case "back":
					System.out.println(back());
					break;	
			}
		}
	}
}
