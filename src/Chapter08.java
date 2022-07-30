
public class Chapter08 {
	public static void main(String[] args) {
		int num = 0;
		while (num < 5) {
			num += 1;
			System.out.println(num);
		}
		
		int[] array = { 2, 4, 6, 8 };
		for (int number : array) {
			System.out.println(number);
		}
	}
}
