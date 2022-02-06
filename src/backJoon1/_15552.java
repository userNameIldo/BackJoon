package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15552 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int total = 0;
		
		for(int i = 0; i < count; i++) {
			total = 0;
			String str = br.readLine();
			int check = str.indexOf(" "); 
			total = Integer.parseInt(str.substring(0, check)) + Integer.parseInt(str.substring(check+1));
			
			System.out.println(total);
		}
		

	}

}
