
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
