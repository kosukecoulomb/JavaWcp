package practice;
import java.util.Random;

public class practice_nextInt {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int i = rnd.nextInt();
		int i2 = rnd.nextInt(100);
		System.out.println(i);
		System.out.println(i2);
	}
	
}
