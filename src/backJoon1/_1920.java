package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1920 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count1 = Integer.parseInt(br.readLine());
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < count1; i++) {
			list1.add(Integer.parseInt(st.nextToken()));
		}
		
		int count2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] result = new int[count2];
		for(int i = 0; i < count2; i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < count1; i++) {
			if(list2.contains(list1.get(i))) {
				int times = list2.indexOf(list1.get(i));
				result[times] = 1;
			}
		}
		
		for(int i = 0; i < count2; i++) {
			System.out.println(result[i]);
		}
	}

}
