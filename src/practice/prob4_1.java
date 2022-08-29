package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int rnd = (int)(Math.random()*100);

		for (int n = 0; n < rnd; n++ ) {
			System.out.print("▪");
		}


	}
}
