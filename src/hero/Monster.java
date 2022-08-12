package hero;

public abstract class Monster {
	int hp;
	public void attack(Hero h) {
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	public void run() {
		System.out.println("は逃げ出した!");
	}
}
