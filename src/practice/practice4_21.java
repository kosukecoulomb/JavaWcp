package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_21 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j || (n - i - 1) == j) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
}