package backJoon1;

import java.util.Scanner;

public class _8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		for(int i = 1; i <= num; i++) {
			total += i;
		}
		
		System.out.println(total);

	}

}
