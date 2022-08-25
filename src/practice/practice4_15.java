package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine());
		int n;
		
		for (n = 2; n <= (i / 2); n++) {
			if (i % n == 0) {
				break;
			}
		}
		if( n > ( i / 2 ) ) {
			System.out.println(i + "は素数です");
		} else {
			System.out.println(i + "は素数ではありません");
		}
	}
}
