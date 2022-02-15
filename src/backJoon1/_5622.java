package backJoon1;

import java.util.Scanner;

public class _5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int alpa[] = new int[26];	
		int totaltimes = 0;
		int times = 2;
		
		for(int i = 0; i < str.length(); i++) {
			
			alpa[str.charAt(i) - 'A']++;
			
		}
		
		for(int i = 0; i < alpa.length; i++) {
			
			if(i%3 == 0) {
				times++;
			}
			totaltimes += alpa[i]*times;
		}
		
		System.out.println(totaltimes);		
	}
    
}
