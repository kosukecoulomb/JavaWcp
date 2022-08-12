package hero;

public class Main {
 public static void main(String[] args) {
	 Hero.setRandomMoney();
	 Hero h1 = new Hero();
	 System.out.println(Hero.money);
	 System.out.println(h1.money);
 }
}
