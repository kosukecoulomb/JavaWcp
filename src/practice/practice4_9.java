package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int max = 0;
		int min = 0;

		for (int n = 0; n < 10; n++) {
			int i = Integer.parseInt(br.readLine());
			if (n == 0) {
				max = i;
				min = i;
			} else {
				if(i > max) {
					max = i;
				}
				if(i < min) {
					min = i;
				}
			}
		}

		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
	}
}
