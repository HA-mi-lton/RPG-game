package monster2;

public class Monster {
	private String name;
	private int hp;
	private int maxHp;
	private int atk;
	private int protect;
	public Monster(String name, int hp, int maxHp, int atk, int protect) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.atk = atk;
		this.protect = protect;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getAtk() {
		return atk;
	}
	public void setProtect(int protect) {
		this.protect = protect;
	}
	public int getProtect() {
		return protect;
	}
	public void attack(Monster enemy) {
		enemy.setHp(enemy.getHp()-(this.getAtk()-enemy.getProtect()));
	}
}
