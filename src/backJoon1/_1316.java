package backJoon1;

import java.util.Scanner;

public class _1316 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < times; i++) {
			
			String str = sc.next();
			for(int j = 0; j < str.length() - 1; j++) {
				char ch = str.charAt(j);
				
				for(int k = j + 1; k < str.length(); k++) {
					if(ch != str.charAt(k)) {
						for(k = k + 1; k < str.length(); k++) {
							
						}
					}
				}
			}
		}
	}

}
