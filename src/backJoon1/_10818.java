package backJoon1;

import java.util.Arrays;
import java.util.Scanner;

public class _10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int[] num = new int[time];
		
		for(int i = 0; i <= time-1; i++) {
			num[i] = sc.nextInt();		
		}
		
		Arrays.sort(num);
		
		System.out.print(num[0] + " " + num[time-1]);		

	}

}
