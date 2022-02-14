package backJoon1;

import java.util.Scanner;

public class _1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.trim();
		String arr[] = str.split(" ");
		if(arr[0].equals("")) {
			System.out.println(arr.length - 1);
		}else {
			System.out.println(arr.length);
		}
	}

}
