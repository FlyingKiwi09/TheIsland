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

	private Class<? extends Animal> animal;
	
	public Egg(int xPosition, int yPosition, Class<? extends Animal> class1) {
		// TODO Auto-generated constructor stub
		super(xPosition, yPosition);
		// TODO Auto-generated constructor stub
		this.animal = class1;
	}

}
