import java.util.ArrayList;

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
	
	public Direction randomDirection() {
		int d = (int) (Math.random() * (3)) + 1;
		switch (d) {
			case 1:
				return Direction.North;
			case 2:
				return Direction.South;
			case 3:
				return Direction.East;
			default: 
				return Direction.West;
		}
	}
	
	public void move() {
		
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
