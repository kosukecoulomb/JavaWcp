package practice;

public class prob4_9 {
	public static void main(String[] args) {
		int i = 11;
		while (i % 10 != 0) {
			int rnd = (int)(Math.random()*100);
			i += rnd;
			i -= 11;
			System.out.println(i);
		}
		System.out.println("終了します");
	}
}
