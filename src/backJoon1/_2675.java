package backJoon1;

import java.util.Scanner;

public class _2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			
			 int times = sc.nextInt();
			 String str = sc.next();
			 
			 for(int j = 0; j < str.length(); j++) {
				 char ch = str.charAt(j);
				 for(int k = 0; k < times; k++) {
					 System.out.print(ch);
				 }
			 }
			 System.out.println();
		}
	}
}
