package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4_6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("０か1を入力してください");
		
		int winCount = 0;
		int loseCount = 0;
						
		for (int n = 1; n <= 10; n++) {
			int i = Integer.parseInt(br.readLine());
			if (i == 1) {
				System.out.println("勝ち");
				winCount++;
			} else if (i == 0) {
				System.out.println("負け");
				loseCount++;
			} else {
				System.out.println("０か1を入力してください");
				n--;
			}
		}
		
		System.out.println("勝ちの総数は" + winCount);
		System.out.println("負けの総数は" + loseCount);
	}
}
