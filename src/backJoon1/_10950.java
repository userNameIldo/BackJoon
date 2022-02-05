package backJoon1;

import java.util.Scanner;

public class _10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int add;
		
		for(int i = 1; i<=count; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			System.out.println(num1+num2);
			
		}

	}

}