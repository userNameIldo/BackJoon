package backJoon1;

import java.util.Scanner;

public class _2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if( 0<=num1 && num1<=23) {
			int num2 = sc.nextInt();
			if( 0<=num2 && num2<=59) {
				if(num2<=44) {
					if(num1==0) {
						System.out.println((num1 + 23) + " " + (num2 + 15));
					}else {
						System.out.println((num1-1) + " " + (num2 + 15));
					}
				}else {
					System.out.println(num1 + " " + (num2 - 45));
				}
			}else {return;}			
		}else {return;}

	}

}
