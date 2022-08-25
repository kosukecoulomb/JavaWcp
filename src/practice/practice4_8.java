package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int max = 0;

		for (int n = 0; n < 10; n++) {
			int i = Integer.parseInt(br.readLine());
			if(i > max) {
				max = i;
			}
		}

		System.out.println("最大値は" + max);
	}
}
