package practice;

public class prob4_8 {
	public static void main(String[] args) {
		int i = 0;
		while (i != 10 ) {
			int rnd = (int)(Math.random()*10);
			i += rnd;
			System.out.println(i);
		}
		System.out.println("終了します");
	}
}
