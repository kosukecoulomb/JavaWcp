package hero;

public class Wizard extends Character {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
	public void attack(Monster m) {

	}
}
