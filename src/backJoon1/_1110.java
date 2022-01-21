package backJoon1;

import java.util.Scanner;

public class _1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		int result = num;
		int num1, num2, num3 = 0;
		int count = 0;
		do {
			//26
			num1 = num%10; //6
			
			num = num/10; //2
			
			num2 = num;   //2
			
			num3 = num1 + num2;
			
			num = num1*10 + (num3 % 10);
			
			count++;
			
		}while(num != result);
			
	    System.out.println(count);

	}

}
