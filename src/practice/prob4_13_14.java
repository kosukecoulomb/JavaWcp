package practice;

public class prob4_13_14 {
	public static void main(String[] args) {
		
		int rnd = (int)(Math.random()*10);
		
		if (rnd >= 5) {
			for (int i = 0; i < rnd; i++) {
				System.out.print("★");
			}
		} else {
			System.out.println("発生した数値：" + rnd);
		}
		
		if (rnd % 2 == 0) {
			for (int i = 0; i < rnd; i++) {
				System.out.print("★");
			}
		} else {
			for (int i = 0; i < rnd; i++) {
				System.out.print("☆");
			}
		}
	}
}
