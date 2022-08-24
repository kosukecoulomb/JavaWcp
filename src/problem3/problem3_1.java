//1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。
package problem3;

public class problem3_1 {
	public static void main(String[] args) {
	int n = (int)(Math.random()*10) + 1;
	System.out.println(n);
	if (n >= 5) {
		System.out.println("5以上です");
	} 
}
}
