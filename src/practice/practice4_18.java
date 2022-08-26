package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_18 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int sum = 0;
		
		for (;;) {
			int i = Integer.parseInt(br.readLine());
			if ( i == 0) {
				break;
			}				
			sum += i;
		}
		
		System.out.println("合計値は" + sum);
	}

}
