import java.util.ArrayList;

/**
 * Animal class is the abstract super class for all animals on an island.
 * <p> 
 * Animal class allows subclasses to store data related to animals including their state (thirsty, hungry, pregnant, agressionLevel, currentSpeed, direction), characteristics (gender, age, gestation period, vision, smell, maximum speed), predators and food sources. 
 * It also provides for core animal behaviour such as eating. 
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */

abstract public class Animal extends LivingThing {
	
	// limits
	public static final int maxHunger = 100;
	public static final int minHunger = 0;
	
	// state
	private boolean thirsty;
	private int hunger; // an integer between 0 and 100 to represent a percentage
	private boolean pregnant;
	private int agressionLevel;
	private int currentSpeed;
	private Direction direction;
	
	// characteristics
	private boolean female; // to store gender
	private double age;
	private int numberOfTurnsGestation;
	private int vision;
	private int smell;
	private int maxSpeed;
	
	// counters
	private int roundsUntilGivesBirth;
	
	// interactions with others
	private ArrayList<String> predators;
	private ArrayList<String> foodSources;

	// constructor
	public Animal(int xPosition, int yPosition, int size, int maxSpeed, int currentSpeed) {
		super(xPosition, yPosition, size);
		this.direction = randomDirection();
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.hunger = randomNum(minHunger, maxHunger); // sets a random hunger level between maxinum hunger and minimum hunger
	}
	

	
	/**
	 * move method moves an animal according to it's current direction and speed so long as it is within the bounds of the island. Then it increase the animals hunger by 1 and sets a new random direciton for the animal.
	 * 
	 * @since 1.0
	 */
	
	public void move() {
		// TODO: if the animal is not going to move out of bounds...
		if (this.direction.equals(Direction.West)) {
			this.setxPosition(this.getxPosition()-this.currentSpeed);
		} else if (this.direction.equals(Direction.East)) {
			this.setxPosition(this.getxPosition()+this.currentSpeed);
		} else if (this.direction.equals(Direction.South)) {
			this.setyPosition(this.getyPosition()+this.currentSpeed);
		} else if (this.direction.equals(Direction.North)) {
			this.setyPosition(this.getyPosition()-this.currentSpeed);
		}
		this.hunger += 1; // increase the animals hunger when it moves
		this.direction = randomDirection();
	}
	
	/**
	 * eat method checks that the animal is next to something it can eat and that it's hunger is over 50%. If so it decrease the animals hunger by 10.
	 * 
	 * @since 1.0
	 */
	
	public void eat() {
		//TODO: if the animal is next to something it can eat...
		if (this.hunger > 50) {
			this.hunger -= 10;
		}
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	private Direction randomDirection() {
		int d = (int) (Math.random() * (4)) + 1;
		switch (d) {
			case 1:
				return Direction.North;
			case 2:
				return Direction.South;
			case 3:
				return Direction.East;
			case 4: 
				return Direction.West;
			default:
				return null;
		}
	}
	
	private int randomNum(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
