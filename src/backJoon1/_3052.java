package backJoon1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			set.add(sc.nextInt()%42);
		}
		
		System.out.println(set.size());
		
	}

}
