package backJoon1;

import java.util.Scanner;

public class _2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 1;
		int result = 2;
		
		if(num == 1) {
			
			System.out.println(1);
			
		}else {
			
			while(result <= num) {
				result += count*6;
				count++;				
			}
			System.out.println(count);
			
		}

	}

}
