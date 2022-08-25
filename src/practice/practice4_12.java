package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int sum = 0;

		while (sum <= 100) {
			sum += Integer.parseInt(br.readLine());
		}

		System.out.println("合計値は" + sum);
	}
}
