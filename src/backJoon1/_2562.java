package backJoon1;

import java.util.Scanner;

public class _2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		
		int count = 0;
		int max = 0;
		int index = 0;
		for(int value : num) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}			
			
		}
		System.out.println(max + "\n" + index);
		
		
	}

}
