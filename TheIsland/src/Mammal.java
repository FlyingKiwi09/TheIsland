/**
 * Mammal class is the abstract super class for all mammals on an island.
 * <p> 
 * Mammal class allows for subclass to do things related to being mammals including being infected with rabies and parasites. 
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
abstract public class Mammal extends Animal {
	
	private boolean parasiticInfection;
	private boolean rabiesInfection;

	/**
	 * Constructs a representation of a mammal
	 * <p> 
	 * @param xPosition stores the x coordinate of the mammal on the island. Should not be null.
	 * @param yPosition stores the y coordinate of the mammal on the island. Should not be null.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Mammal(int xPosition, int yPosition, int size, int maxSpeed, int currentSpeed) {
		super(xPosition, yPosition, size, maxSpeed, currentSpeed);
		// TODO Auto-generated constructor stub
	}

}
