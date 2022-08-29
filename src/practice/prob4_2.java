package practice;

public class prob4_2 {
	public static void main(String[] args) {
		int rnd = (int)(Math.random()*10);
		int n = 0;
		while (n < rnd) {
			System.out.print("▪");
			n++;
		}
	}

}
