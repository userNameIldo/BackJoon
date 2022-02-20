package backJoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int times = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<times; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); //類熱
			int W = Integer.parseInt(st.nextToken()); //陝類 寞熱 
			int N = Integer.parseInt(st.nextToken()); //賃廓簞 槳椒
			
			int y = N%H;
			int x = N/H + 1;
			if(N%H == 0) {
				y = H;
				x = N/H;
			}
			System.out.println(y*100 + x);
		}
		
		
	}

}
