package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _10773 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int times = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int count = 0;
		
		for(int i = 0; i < times; i++) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) {
				list.add(num);
				count += num;
			}else {
				if(list.size() != 0) {
					count -= list.get(list.size() - 1);
					list.remove(list.size() - 1);
				}
			}
			
		}
		System.out.println(count);
	}
}