package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11022 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= count; i++) {
			String str = br.readLine();
			int check = str.indexOf(" ");
			System.out.println("Case #" + i + ": " + str.substring(0, check) + " + " + str.substring(check+1) + " = " + (Integer.parseInt(str.substring(0, check))+Integer.parseInt(str.substring(check+1))));
		}
		
	}

}
