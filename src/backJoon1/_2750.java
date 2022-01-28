package backJoon1;

import java.util.Scanner;

public class _2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] num = new int[count];
		
		int cnum;
		
		for(int i = 0; i <= count-1; i++) {
			
			num[i] = sc.nextInt();		
			
		}
		
		for(int j = 0; j<= count-1; j++) {
			
			for(int k = j; k<= count-1; k++) {
				
				if(num[j] > num[k]) {
					cnum = num[j];
					num[j] = num[k];
					num[k] = cnum;
				}
				
			}
			
		}
		
		for(int i = 0; i <= count-1; i++) {
			
			System.out.println(num[i]);		
			
		}

	}

}
