package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("該当する曜日の数字を入力してください");
		System.out.println(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = Integer.parseInt(br.readLine());
		
		System.out.println("該当する時間の数字を入力してください");
		System.out.println(">0=午前、1=午後、2=夜間");
		int time = Integer.parseInt(br.readLine());
		
		boolean bl = true;
		
		if (day == 0) {
			bl = false;
		} else if ((day == 2 || day == 5) && time == 0) {
			bl = false;
		} else if (day == 3 && time == 2) {
			bl = false;
		} else if (day == 6 && (time == 1 || time == 2)) {
			bl = false;
		} else {
			bl = true;
		}
		
		if (bl == false) {
			System.out.println("休診日です");
		} else {
			System.out.println("開業しています");
		}
	}
}
