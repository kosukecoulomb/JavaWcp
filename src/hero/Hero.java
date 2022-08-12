package hero;

public class Hero extends Character {
	String name;
	private int hp;
	//Sword sword;
	static int money;

	public void attack(Monster m) {
		//System.out.println(this.name + "は" + this.sword.name + "で攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた");
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println(this.name + "5のダメージ!");
	}
	private void die() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは、" + this.hp + "でした");
	}

	//gettr
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	//setter
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		if (name.length() > 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	//コンストラクタ
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
}
