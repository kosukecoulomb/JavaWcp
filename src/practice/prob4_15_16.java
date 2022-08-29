package practice;

public class prob4_15_16 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			
			if (i % 10 == 0) {
				System.out.println(" ");
			}
		}
		
		for (int n = 1; n <= 9; n++) {
			for (int n2 = 1; n2 <= 9; n2++) {
				System.out.print(n + "*" + n2 + "=" + (n * n2) + " ");
			}
			System.out.println(" ");
		}
	}
}
