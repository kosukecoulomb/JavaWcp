package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3_12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		 System.out.println("好きな寿司を選択してください");
		 System.out.println("1：まぐろ　2：えび　3：こはだ");

		 int i = Integer.parseInt(br.readLine());

		 switch (i) {
		 case 1:
			 System.out.println("まぐろは中トロが一番！");
			 break;
		 case 2:
			 System.out.println("えびは生がいよね");
			 break;
		 case 3:
			 System.out.println("こはだってなんだ？");
			 break;
		default:
			System.out.println("1~3の中から選んでください");
			break;
		 }
	}
}
