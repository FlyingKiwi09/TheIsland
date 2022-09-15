
abstract public class LivingThing extends IslandItem {
	
	private boolean alive;
	private int size;

	public LivingThing(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.alive = true;
		
	}
	
	public void isEaten() {
		
	}
	
	public void die() {
		
	}
	
	public void grow() {
		
	}

}
