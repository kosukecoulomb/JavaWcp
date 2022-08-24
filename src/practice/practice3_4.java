package practice;
import java.io.*;

public class practice3_4{
 public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(
	 new InputStreamReader(System.in));
	 
	 int x = Integer.parseInt(br.readLine());
	 int y = Integer.parseInt(br.readLine());
	 
	 if(x > y) {
			System.out.println("ｘはｙより大きい");
		} else if (x < y) {
			System.out.println("ｘはｙより小さい");
		} else if (x == y) {
			System.out.println("ｘとｙは等しい");
		}
 }
}
