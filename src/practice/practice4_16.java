package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_16 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine());
		
		for (int n = 2; n > 0; n++) {
			while (i % n == 0) {
				System.out.print(n + " ");
				i /= n;
			}
		}
	}
}
