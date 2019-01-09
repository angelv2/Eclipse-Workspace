package turotialpackage;

public class Hero {
	private String name;
	private String power;
	private int age;
	private int health;
	private int damage;
	
	public Hero() {
		name = "Jane doe";
		power = "Super speed";
		age = 20;
		health = 100;
		damage = 10;
	}
	
	public Hero(String name, String power, int age, int health, int damage) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.health = health;
		this.damage = damage;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void fight(Hero h) {
		h.setHealth(h.getHealth() - this.damage);
}
	
	public String toString() {
		return "Name: " + name + " Power: " + power;
	}	
}//end Hero class





