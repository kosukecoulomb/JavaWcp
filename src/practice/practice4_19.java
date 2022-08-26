package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int sum = 0;
		int count = 0;
		
		for (;;) {
			int i = Integer.parseInt(br.readLine());
			if (count == 0 && i == 0) {
				continue;
			}
			if ( i == 0) {
				break;
			}
			sum += i;
			count++;
		}
		
		System.out.println("平均値は" + (sum / count));
	}

}
