package backJoon1;

import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String arr[] = str.split("");
		String apa[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		int apac[] = new int[26];
		
		for(int i = 0; i<apac.length; i++) {
			
			apac[i] = -1;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<apa.length; j++) {
				if(arr[i].equals(apa[j])) {
					if(apac[j] == -1) {
						apac[j] = i;
					}
				}
			}
		}
		
		for(int var : apac) {
			System.out.print(var + " ");
		}

	}

}
