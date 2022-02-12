package backJoon1;

import java.util.Scanner;

public class _11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		String str = sc.next();
		String arr[] = str.split("");
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += Integer.parseInt(arr[i]);
		}
		System.out.println(total);
	}

}
