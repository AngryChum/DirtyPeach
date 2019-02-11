
import java.util.Scanner;

public class GameManager {

	Scanner scan = new Scanner(System.in);
	String charClass;
	String name;
	Player player;

	public void Start() {
		
        System.out.println("Choose your class: ");
        System.out.println("'w' for a strong melee warrior");
        System.out.println("'a' for a skilled archer");
        System.out.println("'m' for a magical mage");
        charClass = scan.nextLine();
        
        player = chooseClass();
		
        while(charClass.charAt(0) != 'w' && charClass.charAt(0) != 'a' && charClass.charAt(0) != 'm'){
            System.out.println("'w' for warrior");
            System.out.println("'a' for archer");
            System.out.println("'m' for mage");
            charClass = scan.nextLine();
        }
		
		System.out.println("Hello Adventurer, Welcome to TextQuest");
		System.out.println("Please Enter your name: ");
		name = scan.nextLine(); 
	}
	
	//public Static Character chooseClass() {
	public Player chooseClass() { //you might need to make this method static. not too sure
		
		
	    switch(charClass){    
	        case "W":    
	            return new Warrior(charClass, 10, 12, 15, 16);
	        case "A":    
	            return new Warrior(charClass, 10, 12, 15, 16);
	        default:
	            System.out.println("Error that play doesnt exist!");
	   }
	    return null;
	}
	
	public void Run()
	{
		Start();
		player.PrintStats();
		
	}
}
