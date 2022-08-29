package practice;

public class prob4_11_12 {
	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < 5; i++) {
			int rnd = (int)(Math.random()*100);
			System.out.println(rnd);
			
			if (i == 0) {
				min = rnd;
				max = rnd;
			}
			
			if (rnd > max) {
				max = rnd;
			}
			
			if (rnd < min) {
				min = rnd;
			}
		}
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
	}
}
