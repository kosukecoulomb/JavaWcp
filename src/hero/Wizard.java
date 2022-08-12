package hero;

public class Wizard extends Character {
	int mp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した");
	}
	public void attack(Monster m) {

	}
}
