package backJoon1;

import java.util.Scanner;

public class _14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		if( -1000<=num1&& num1<=1000) {
			int num2 = sc.nextInt();
			if( -1000<=num2&& num2<=1000) {
				if( 0<num1) {
					if(0<num2) {
						System.out.println(1);
					}else {
						System.out.println(4);
					}
				}else {
					if(0<num2) {
						System.out.println(2);
					}else {
						System.out.println(3);
					}
				}
			}else {
				return;
			}
			
		}else {
			
			return;
			
		}
		

	}

}
