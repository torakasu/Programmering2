/**
 * 
 */
package multitasking;

/**
 * @author casper.hamren
 * Använd setters och getters, dom är alltid likadana!
 */
public class Player {
	private int hp = 100;
	private int numberOfBullets = 0;
	private int damage = 0;
	private String name;
	private int stamina = 100;
	
	private static int fistDamage = 5;
	
	/**
	 * Constructor for the player class
	 */
	public Player(String name) {
		this.name = name;
	}
	/**
	 * Returns the name of the player
	 * @return String name
	 */
	public String getName() {
		return this.name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	public int getFistDamage() {
		return fistDamage;
	}
	/**
	 * När det är en static då använder man inte this, utan man referar till hela Player classen.
	 * @param fistDamage
	 */
	public void setFistDamage(int fistDamage) {
		Player.fistDamage = fistDamage;
	}
	
	
	
	
}
