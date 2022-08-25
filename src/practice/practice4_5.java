package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("整数を10個入力してください");
		
		int sum = 0;
		
		for (int n = 1; n <= 10; n++) {
			int i = Integer.parseInt(br.readLine());
			sum += i;
		}
		
		System.out.println("平均値は" + (sum / 10));
	}
}
