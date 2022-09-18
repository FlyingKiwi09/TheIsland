/**
 * Grass class represents grass at a particular point on the island. 
 * <p>  
 * Grass, like all subclasses of LivingThing, can grow, be eaten and die. Grass has an intial size between 1 and 5.
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
public class Grass extends Foliage {

	/**
	 * Constructs a representation of grass at a particular point on the island.
	 * <p> 
	 * @param xPosition stores the x coordinate of the grass on the island. Should not be null.
	 * @param yPosition stores the y coordinate of the grass on the island. Should not be null.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Grass(int xPosition, int yPosition) {
		super(xPosition, yPosition, randomNum(1, 5)); // a grass of random size between 1 and 5
	}
	
	/**
	 * grow method increases the size of the grass by 1
	 * 
	 * @since 1.0
	 */
	public void grow() {
		this.setSize(this.getSize()+1);
	}
	
	private static int randomNum(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
