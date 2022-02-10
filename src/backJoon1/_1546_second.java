package backJoon1;

import java.util.Scanner;

public class _1546_second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		double max = 0;
		int total = 0;
		double avr = 0;
		double[] num = new double[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = sc.nextDouble();
			if(max < num[i]) {
				max = num[i];
			}
		}
		for(int i = 0; i < count; i++) {
			num[i] = num[i]*100.0/max;
			System.out.println( i + " : " + num[i]);
			total += num[i];
		}
		avr = (double)total/count;
		System.out.println(avr);
	}

}
