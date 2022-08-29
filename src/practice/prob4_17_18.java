package practice;

public class prob4_17_18 {
	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {			
			for(int b = 1; b <= n; b++) {
				System.out.print("▪");
			}
			for(int w = 10; w >= n; w--) {
				System.out.print("□");
			}
			System.out.println();
		}		
	}
}
