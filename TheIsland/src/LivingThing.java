/**
 * LivingThing class is the abstract super class for all living things on an island.
 * <p> 
 * LivingThing class allows for living things to be alive and have a size that can be changed during a 'turn' of the Island.
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */

abstract public class LivingThing extends IslandItem {
	
	private boolean alive;
	private int size;

	public LivingThing(int xPosition, int yPosition, int size) {
		super(xPosition, yPosition);
		this.alive = true;
		this.size = size;
		
	}
	
	public void isEaten() {
		
	}
	
	public void die() {
		
	}
	
	public void grow() {
		
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}
