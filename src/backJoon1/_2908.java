package backJoon1;

import java.util.Scanner;

public class _2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		String cnum1[] = num1.split("");
		String cnum2[] = num2.split("");
		String rnum1 = "";
		String rnum2 = "";
		for(int i = cnum1.length - 1; i >= 0; i--) {
			rnum1 += cnum1[i];
			rnum2 += cnum2[i];
		}
		System.out.println(Integer.parseInt(rnum1)> Integer.parseInt(rnum2) ? Integer.parseInt(rnum1) : Integer.parseInt(rnum2));

	}

}
