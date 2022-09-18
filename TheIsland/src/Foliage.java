/**
 * Foliage class is the abstract super class for plant life on an island.
 * <p> 
 * Foliage class extends the LivingThing class and allows for subclasses to do things related to being plants including spread seeds. 
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
abstract public class Foliage extends LivingThing {
	
	/**
	 * Constructs a piece of foliage on the island.
	 * <p> 
	 * @param xPosition stores the x coordinate of the foliage on the island. Should not be null.
	 * @param yPosition stores the y coordinate of the foliage on the island. Should not be null.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Foliage(int xPosition, int yPosition, int size) {
		super(xPosition, yPosition, size);
	}
	
	
	public void spreadSeeds() {
		// this class will check enough time has passed and there has been enough rainfall and sunlight hours on the island and spreadSeeds of the plant. 
	}

}
