/**
 * IslandItem class is the abstract super class for all items on an island.
 * <p> 
 * IslandItem maintains the x and y coordinates of each item on the island.
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */


abstract public class IslandItem {
	protected int xPosition, yPosition;

	public IslandItem(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	
}
