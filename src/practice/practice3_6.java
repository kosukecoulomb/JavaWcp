package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine());
		
		if (i % 2 == 0) {
			if (i >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {
			if (i >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}
	}
}
