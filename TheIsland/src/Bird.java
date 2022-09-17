
abstract public class Bird extends Animal {

	private int maxHeight;
//	private Nest nest;
	
	public Bird(int xPosition, int yPosition, int size, int maxSpeed, int currentSpeed, int maxHeight) {
		super(xPosition, yPosition, size, maxSpeed, currentSpeed);
		this.maxHeight = maxHeight;
//		this.nest = null;
	}
	
	public void fly() {
		// this method allows the bird to go anywhere on the island, it checks that the bird can fly high enough to get over any obstacles. 
	}

}
