/**
 * Kiwi class represents a kiwi on the island. 
 * <p>  
 * Kiwi, extend the bird class but have a maximum flight height of 0 and therefore cannot fly. Kiwi has an maximum speed of 4 and their intial speed is 2.  
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
public class Kiwi extends Bird {

	/**
	 * Constructs a representation of a Kiwi.
	 * <p> 
	 * @param xPosition stores the x coordinate of the Kiwi on the island. Should not be null.
	 * @param yPosition stores the y coordinate of the Kiwi on the island. Should not be null.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Kiwi(int xPosition, int yPosition) {
		super(xPosition, yPosition, 5, 4, 2, 0);
	}

	/**
	 * buildNest method constructs a new nest and stores it to the kiwi object. The new nest is given the Kiwi's current coordinates.
	 * <p> 
	 * 
	 * @since 1.0
	 */
	@Override
	public void buildNest() {
		this.nest = new Nest(this.xPosition, this.yPosition);
	}

	@Override
	public void incubate() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * layEgg method creates a new Egg and stores it to the nest belonging to the Kiwi.
	 * <p> 
	 * 
	 * @since 1.0
	 */
	
	@Override
	public void layEgg() {
		Egg newEgg = new Egg(this.xPosition, this.yPosition, this.getClass());
		this.nest.getEggs().add(newEgg);
	}

}
