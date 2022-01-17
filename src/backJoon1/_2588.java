package backJoon1;
import java.util.Scanner;

public class _2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int lastResult = num1 * num2;
		int result;
		int sum;
		
		while(num2>0) {
			sum = num2%10;
			
			result = num1 * sum;
			System.out.println(result);
						
			num2 = num2/10;
		}
		
		System.out.println(lastResult);		 
		

	}

}
