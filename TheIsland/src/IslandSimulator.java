import java.util.ArrayList;

/**
 * IslandSimulator class controls the creation and simulation of Islands.
 * <p> 
 * IslandSimulator controls the creation of Islands and other objects contained within it such as rabbits. It allows for the simulation of turns on these islands.
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */


public class IslandSimulator {
	
	private static ArrayList<Island> islands = new ArrayList<Island>();
	
	// constructor - parameter specifices the number of islands to be created in this simulation
	public IslandSimulator(int numberOfIslands) {
		for (int i = 0; i < numberOfIslands; i++) {
			generateIsland();
		}
	}
	
	/**
	 * generateIsland() creates a new Island 
	 * <p> 
	 * Creates a new Island including it's associated IslandItems such as rabbits and stores these to the IslandSimulator.
	 */
	
	// generates an island and it's IslandItems
	public void generateIsland() {
		Island newIsland = new Island();
		generateRabbits(newIsland);
		islands.add(newIsland);
	}
	
	// generates rabbits at random positions on the island
	private void generateRabbits(Island island) {
		
		int numberOfRabbits = randomNum(5,10); // so that 5 to 10 rabbits will be generated on the island
		
		for (int i = 0; i < numberOfRabbits; i++) {
			int randomX = randomNum(0, islands.get(0).getWidth());
			int randomY = randomNum(0, islands.get(0).getLength());
			Rabbit newRabbit = new Rabbit(randomX, randomY);
			island.getLivingThings().add(newRabbit);
		}
	}
	
	public void testIsland() {
		System.out.println(islands.get(0).getLength() + " " + islands.get(0).getWidth());
	}
	
	private int randomNum(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
