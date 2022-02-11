package backJoon1;

import java.util.Scanner;

public class _4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		for(int k = 0; k < times; k++) {
			int pc = sc.nextInt();
			int arr[] = new int[pc];
			int avr = 0;
			int count = 0;
			double per = 0;
			for(int i = 0; i < pc; i++) {
				arr[i] = sc.nextInt();
				avr += arr[i];
			}
			avr = avr/pc;
	
			for(int j = 0; j < pc; j++) {
				if(arr[j] > avr) 
					count++;
			}
	
			per = count*100.0/pc;
			System.out.printf("%.3f%%\n", per);
			}
		}

}
