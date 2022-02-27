package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10866 {

	public static int[] deque = new int[20001];
	public static int front = 10000;
	public static int back = 10000;
	public static int size = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine() , " ");
			
			switch(st.nextToken()) {
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				System.out.println(pop_front());
				break;
			case "pop_back":
				System.out.println(pop_back());
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
	
	public static void push_front(int num) {
		
		deque[front] = num;
		front--;
		size++;
		
	}
	
	public static void push_back(int num) {
		back++;
		deque[back] = num;
		size++;
	}
	
	public static int pop_front() {
		if(size()<=0) {
			return -1;
		}else {
			int num = deque[front + 1];
			size--;
			front++;
			return num;
		}
	}
	
	public static int pop_back() {
		if(size()<=0) {
			return -1;
		}else {
			int num = deque[back];
			size--;
			back--;
			return num;
		}
	}
	
	public static int size() {
		return size;		
	}
	
	public static int empty() {
		if(size() <= 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front() {
		if(size() <= 0) {
			return -1;
		}else {
			int num = deque[front + 1];
			return num;
		}
	}
	
	public static int back() {
		
		if(size() <= 0) {
			return -1;
		}else {
			int num = deque[back];
			return num;
		}
		
	}
	

}
