/**
 * Bird class represents a birds on the island. 
 * <p>  
 * Bird, extends the Animal class and implements the LaysInNest interface. Birds have a maximum height which should be set in subclasses extending this Class. They may also have a nest and can fly.
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
abstract public class Bird extends Animal implements LaysInNest{

	private int maxHeight;
	private Nest nest;
	
	public Bird(int xPosition, int yPosition, int size, int maxSpeed, int currentSpeed, int maxHeight) {
		super(xPosition, yPosition, size, maxSpeed, currentSpeed);
		this.maxHeight = maxHeight;
		this.nest = null;
	}
	
	public void fly() {
		// this method allows the bird to go anywhere on the island, it checks that the bird can fly high enough to get over any obstacles. 
	}

}
