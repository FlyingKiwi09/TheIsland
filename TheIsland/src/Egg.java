/**
 * Egg class represents an egg on the island. 
 * <p>  
 * Eggs must belong to an nest on the island and contains an animal. 
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
public class Egg extends IslandItem {

	/*// to store the type of animal that will hatch from the egg. 
	 * Important for future implementation of brood parasites.
	 */
	private Class<? extends Animal> animal; 
	
	/**
	 * Egg constructor method creates a new Egg object.
	 * <p> 
	 * @param xPosition stores the x coordinate of the Egg on the island. If the egg is in a nest this should be the same as the xPosition of the nest.
	 * @param yPosition stores the y coordinate of the Egg on the island. If the egg is in a nest this should be the same as the yPosition of the nest. 
	 * @param class1 stores the class of the animal in the egg.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Egg(int xPosition, int yPosition, Class<? extends Animal> class1) {
		// TODO Auto-generated constructor stub
		super(xPosition, yPosition);
		// TODO Auto-generated constructor stub
		this.animal = class1;
	}

}
