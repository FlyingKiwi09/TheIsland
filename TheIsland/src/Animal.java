import java.util.ArrayList;

abstract public class Animal extends LivingThing {
	
	// state
	private boolean thirsty;
	private boolean hungry;
	private boolean pregnant;
	private int agressionLevel;
	
	// characteristics
	private boolean female; // to store gender
	private int age;
	private int numberOfTurnsGestation;
	private int vision;
	private int smell;
	private int speed;
	
	// counters
	private int roundsUntilGivesBirth;
	
	// interactions with others
	private ArrayList<String> predators;
	private ArrayList<String> foodSources;


	public Animal(int xPosition, int yPosition, int size, boolean alive) {
		super(xPosition, yPosition, size, alive);
		
	}

}
