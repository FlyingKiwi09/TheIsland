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

	public Kiwi(int xPosition, int yPosition) {
		super(xPosition, yPosition, 5, 4, 2, 0);
	}

	@Override
	public void buildNest() {
		// TODO Auto-generated method stub
		this.nest = new Nest(this.xPosition, this.yPosition);
	}

	@Override
	public void incubate() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * layEgg method creates a new Egg and stores it to the nest
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
