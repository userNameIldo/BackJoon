package backJoon1;

import java.util.Scanner;

public class _5622_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if('A'<= ch && ch <='C') {
				count += 3;
			}else if('D'<= ch && ch <='F') {
				count += 4;
			}else if('G'<= ch && ch <='I') {
				count += 5;
			}else if('J'<= ch && ch <='L') {
				count += 6;
			}else if('M'<= ch && ch <='O') {
				count += 7;
			}else if('P'<= ch && ch <='S') {
				count += 8;
			}else if('T'<= ch && ch <='V') {
				count += 9;
			}else if('W'<= ch && ch <='Z') {
				count += 10;
			}
		}
		System.out.println(count);		
	}
    
}
