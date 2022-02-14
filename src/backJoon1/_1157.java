package backJoon1;

import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int max = -1;
		int arr[] = new int[26];

		String str = sc.next().toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch - 'A'] ++;		
		}
		
		char ch = '?';
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 'A');
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
	}

}
