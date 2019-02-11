
public class Player {

	String name;
	int health;
	int Armour;
	int XP;
	int level;
	
	public Player(String name, int health, int Armour, int xp, int level) {
		
		this.name  = name;
		this.health = health;
		this.Armour = Armour;
		this.XP = xp;
		this.level = level;
	}
	
	public int GetHealth()
	{
		return health;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public String getName() {
		return name;
	}
	
    void PrintStats() 
    { 
    	System.out.println(name + "\nhp: " + health + "\nArmour: " + Armour + "\nxp: " + XP + "\nLevel: "  + level + "\n");
    }

}
