package objects;

public class Players {
	int health;
	int attackDamage;
	String PName;
	String Type;
	
	public Players(int health, int attackDamage, String PName, String Type) {
		this.health = health;
		this.attackDamage = attackDamage;
		this.PName = PName;
		this.Type = Type;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health=health;
	}
	public int getAttackDamage() {
		return attackDamage;
	}
	public void setDamage(int attackDamage) {
		this.attackDamage=attackDamage;
	}
	public String getPName() {
		return PName;
	}
	public void setName(String PName) {
		this.PName=PName;
	}
	public void setType(String Type) {
		this.Type=Type;
	}
	public String getType() {
		return Type;
	}
	}
