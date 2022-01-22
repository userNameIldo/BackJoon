package backJoon1;

import java.util.Scanner;

public class _10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 1;
		
		
		if(0<= num && num <= 12) {
			for(int i = 1; i <= num; i++) {
				result = result * i;
			}
		}
		
		System.out.println(result);
		
	}

}
