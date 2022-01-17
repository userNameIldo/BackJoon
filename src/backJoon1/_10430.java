package backJoon1;

import java.util.Scanner;

public class _10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int result;
		result = (num1+num2)%num3;
		System.out.println(result);
		result = ((num1%num3) +(num2%num3))%num3;
		System.out.println(result);
		result = (num1*num2)%num3;
		System.out.println(result);
		result = ((num1%num3)*(num2%num3))%num3;
		System.out.println(result);
		

	}

}
