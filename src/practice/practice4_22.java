package practice;

public class practice4_22 {
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;
		
		while (n1 <= 1000) {
			System.out.print(n1 + " ");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
		
		for(int n = 1; n >= 3; n++) {
			for (int j = 3; n<=1; n--) {
				if (n != j) {
					System.out.print("(" + n + "," + j + ")");
				}
			}
		}
	}

}
