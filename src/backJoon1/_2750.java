package backJoon1;

import java.util.Scanner;

public class _2750 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] num = new int[count];
		
		int cnum;
		
		for(int i = 0; i < count; i++) {
			
			num[i] = sc.nextInt();		
			
		}
		
		for(int j = 0; j< count; j++) {
			
			for(int k = j; k< count; k++) {
				
				if(num[j] > num[k]) {
					cnum = num[j];
					num[j] = num[k];
					num[k] = cnum;
				}
				
			}
			
			System.out.println(num[j]);		
			
		}

	}

}
