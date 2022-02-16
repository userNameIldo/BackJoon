package backJoon1;

import java.util.Scanner;

public class _2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i < str.length() - 1) {
				if(ch == 'c') {
					if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
						i++;
					}
				}else if(ch == 'd') {
					if(str.charAt(i+1) == '-') {
						i++;
					}else if(i < str.length() - 2 && str.charAt(i+1) == 'z') {
						if(str.charAt(i+2) == '=') {
							i += 2;
						}
					}
				}else if(ch == 'l' || ch == 'n') {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}else if(ch == 's' || ch == 'z') {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			count++;	
		}
		System.out.println(count);
		
	}

}
