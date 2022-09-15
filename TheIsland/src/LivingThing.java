
abstract public class LivingThing extends IslandItem {
	
	private boolean alive;
	private int size;

	public LivingThing(int xPosition, int yPosition, int size, boolean alive) {
		super(xPosition, yPosition);
		this.size = size;
		this.alive = alive;
		
	}
	
	public void isEaten() {
		
	}
	
	public void die() {
		
	}
	
	public void grow() {
		
	}

}
