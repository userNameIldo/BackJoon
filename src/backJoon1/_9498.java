package backJoon1;

import java.util.Scanner;

public class _9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		char hak;
		
		if(0<= num1 && num1 <= 100) {
			
			if(90<= num1 && num1 <= 100) {
				hak = 'A';
			}else if(80<= num1 && num1 <= 89) {
				hak = 'B';
			}else if(70<= num1 && num1 <= 79) {
				hak = 'C';
			}else if(60<= num1 && num1 <= 69) {
				hak = 'D';
			}else {
				hak = 'F';
			}
			
			System.out.println(hak);
			
		}else {
			System.out.println("점수 오류입니다.");
		}

	}

}
