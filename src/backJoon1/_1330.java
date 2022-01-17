package backJoon1;

import java.util.Scanner;

public class _1330 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((-10000<= num1 && num1 <= 10000) && (-10000<= num2 && num2 <= 10000)) {
			
			if(num1 > num2) {
				System.out.println(">");
			}else if(num1 < num2) {
				System.out.println("<");
			}else {
				System.out.println("==");
			}
			
		}
		
	}

}
