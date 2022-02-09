package backJoon1;

import java.util.Scanner;

public class _2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		String total = Integer.toString(num1 * num2 * num3);
		
		String arr[] = total.split("");
		
		int count[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < 10; j++) {
				if(Integer.parseInt(arr[i]) == j) {
					count[j]++;
				}
			}
			
		}
		for(int i = 0; i < 10; i++) {
			
			System.out.println(count[i]);
			
		}
		
		
	}

}
