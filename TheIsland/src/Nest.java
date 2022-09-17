import java.util.ArrayList;

/**
 * Nest class represents a nests on the island. 
 * <p>  
 * Nests must belong to an animal on the island and may contain 1 or more eggs. 
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
public class Nest extends IslandItem {

	private ArrayList<Egg> eggs;
	
	/**
	 * Nest constructor method creates a new Nest.
	 * <p> 
	 * @param xPosition stores the x coordinate of the Nest on the island. 
	 * @param yPosition stores the y coordinate of the Nest on the island.
	 * @author Alina Hookway
	 * @version 1.0
	 * @since 1.0
	 */
	public Nest(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.eggs = new ArrayList<Egg>();
	}

	public ArrayList<Egg> getEggs() {
		return eggs;
	}

	public void setEggs(ArrayList<Egg> eggs) {
		this.eggs = eggs;
	}
	


}
