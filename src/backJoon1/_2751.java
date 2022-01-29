package backJoon1;

import java.io.IOException;
import java.util.*;

public class _2751 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int count = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			
			list.add(sc.nextInt());		
			
		}

		Collections.sort(list);
		
		for(int n : list) {
			sb.append(n).append('\n');
		}
		System.out.println(sb);
	
	}

}
