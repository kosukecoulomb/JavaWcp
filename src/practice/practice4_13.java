package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int s = 0;
		int b = 0;

		while (s < 3 && b < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファール=3 ？");
			int j = Integer.parseInt(br.readLine());
			if (j == 1) {
				s++;
			} else if (j == 2) {
				b++;
			} else if (j == 3 && s < 2) {
				s++;
			}
		}

		System.out.println(s + "ストライク" + b + "ボール");
	}

}
