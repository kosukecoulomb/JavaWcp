package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_10 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine());
		
		for (int n = 0; n < i ; n++ ) {
			System.out.println("*");
		}
	}
}
