import java.util.ArrayList;

/**
 * Island class represents a two-dimesional world of fixed width and height and the items contained within it. 
 * <p> 
 * The life of the items (living things, geographical features and others) can be simulated on a turn basis.
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */

public class Island {
	private static final int width = 100;
	private static final int length = 100;
	
	private ArrayList<LivingThing> livingThings = new ArrayList<LivingThing>();
	
	public Island() {
	}
	
	/**
	 * simulateTurn method updates the island for one turn during which all animals move according to their current direction and speed and their direction is updated to a new random direction. Grass grows.
	 * 
	 * @since 1.0
	 * 
	 */
	
	public void simulateTurn() {
		for (LivingThing lt: livingThings) {
			if (lt instanceof Animal) {
				((Animal) lt).move();
			} else if (lt instanceof Grass) {
				((Grass) lt).grow();
			}
		}
	}
	

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}


	public ArrayList<LivingThing> getLivingThings() {
		return livingThings;
	}




	public void setLivingThings(ArrayList<LivingThing> livingThings) {
		this.livingThings = livingThings;
	}
	
	
	
}
