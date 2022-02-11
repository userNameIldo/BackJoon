package backJoon1;

import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		
		int total = 0;
		int count = 0;
		for(int j = 1; j <= time; j++) {
			
			String str = sc.next();
			String arr[] = str.split("");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals("O")) {
					count++;
					total += count;
				}else {
					count = 0;
				}
			}
			System.out.println(total);
			count = 0;
			total = 0;
		}
	}

}
