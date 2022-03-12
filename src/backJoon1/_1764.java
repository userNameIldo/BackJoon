package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		HashSet<String> arr1 = new HashSet<>();
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arr1.add(br.readLine());
		}
		
		for(int i = 0; i< M; i++) {
			String str = br.readLine();
			if(arr1.contains(str))
				result.add(str);
			
		}
		
		Collections.sort(result);
		
		System.out.println(result.size());
		
		for(String str : result) {
			System.out.println(str);
		}

		
	}

}
