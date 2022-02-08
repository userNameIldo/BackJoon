package backJoon1;

import java.util.Scanner;

public class _10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int num = sc.nextInt();
		
		int arr[] = new int[count];
		
		for(int i = 0; i < count; i++) {
		
			arr[i] = sc.nextInt();
			
		}
		
		for(int j = 0; j < count; j++) {
			
			if(arr[j] < num) {
				System.out.print(arr[j] + " ");
			}
			
		}
	}
}
