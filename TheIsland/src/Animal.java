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
	
	// state
	private boolean thirsty;
	private boolean hungry;
	private boolean pregnant;
	private int agressionLevel;
	private int currentSpeed;
	private Direction direction;
	
	// characteristics
	private boolean female; // to store gender
	private int age;
	private int numberOfTurnsGestation;
	private int vision;
	private int smell;
	private int maxSpeed;
	
	// counters
	private int roundsUntilGivesBirth;
	
	// interactions with others
	private ArrayList<String> predators;
	private ArrayList<String> foodSources;


	public Animal(int xPosition, int yPosition, int size, int maxSpeed, int currentSpeed) {
		super(xPosition, yPosition, size);
		this.direction = randomDirection();
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
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
	
	/**
	 * move method moves an animal according to it's current direction and speed then sets a new random direciton for the animal.
	 * 
	 * @since 2.0
	 * @param worm the first segment of an existing worm. Should not be null.
	 */
	
	public void move() {
		if (this.direction.equals(Direction.West)) {
			this.setxPosition(this.getxPosition()-this.currentSpeed);
		} else if (this.direction.equals(Direction.East)) {
			this.setxPosition(this.getxPosition()+this.currentSpeed);
		} else if (this.direction.equals(Direction.South)) {
			this.setyPosition(this.getyPosition()+this.currentSpeed);
		} else if (this.direction.equals(Direction.North)) {
			this.setyPosition(this.getyPosition()-this.currentSpeed);
		}
		this.direction = randomDirection();
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
	
	

}
