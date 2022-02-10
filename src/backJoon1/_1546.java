package backJoon1;

import java.util.Scanner;

public class _1546{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int score = 0;
		int max = 0;
		int total = 0;
		double result = 0;
		
		for(int i = 0; i < count; i++) {
			score = sc.nextInt();
			total += score;
			if(max< score) {
				max = score;
			}
		}
		result = total*100.0/max/count;
		System.out.printf("%f", result);
		
	}

}
