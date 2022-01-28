package backJoon1;

import java.util.Scanner;

public class _10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(fibonacci(num));
		
		
	}
	
	static int fibonacci(int N) {
		
		if(N==0) return 0;
		if(N==1) return 1;
		
		return fibonacci(N-1) + fibonacci(N-2);
		
	}

}
