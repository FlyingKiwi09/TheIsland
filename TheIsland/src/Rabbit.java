/**
 * Rabbit class represents rabbits. 
 * <p>  
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
public class Rabbit extends Mammal {
	/**
	 * Constructs a representation of a rabbit
	 * <p> 
	 * @param xPosition stores the x coordinate of the rabbit on the island. Should not be null.
	 * @param yPosition stores the y coordinate of the rabbit on the island. Should not be null.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Rabbit(int xPosition, int yPosition) {
		super(xPosition, yPosition,5, 5, 2);
	}

}
