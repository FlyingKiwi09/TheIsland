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

}
