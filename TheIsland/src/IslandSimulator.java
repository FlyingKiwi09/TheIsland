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
	 * Creates a new Island including it's associated IslandItems such as rabbits, grass and kiwi and stores these to the IslandSimulator.
	 * 
	 * @since 1.0
	 */
	
	// generates an island and it's IslandItems
	public void generateIsland() {
		Island newIsland = new Island();
		islands.add(newIsland);
		generateRabbits(newIsland);
		generateGrass(newIsland);
		generateKiwi(newIsland);

	}
	
	/**
	 * runSimulation method runs a simulation of the islands in the IslandSimulator.
	 * <p> 
	 * 
	 * @param numberOfTurns is the number of iterations each Island will run through. Should be a non-zero positive integer. Should not be null.
	 * @since 1.0
	 */
	public void runSimulation(int numberOfTurns) {
		for (int i = 0; i < numberOfTurns; i++) {
			for (Island island : islands) {
				island.simulateTurn();
			}
		}
	}
	
	/**
	 * reportOnIslands method prints the number of living things currently surviving on each island in the simulation
	 * <p> 
	 * 
	 * @since 1.0
	 */
	public void reportOnIslands() {
		for (int i = 0; i < islands.size(); i++) {
			int survivingAnimals = islands.get(i).getLivingThings().size();
			System.out.println("Island " + (i+1) + " has " + survivingAnimals + " surviving animals.");
		}
	}
	
	// generates rabbits at random positions on an island
	private void generateRabbits(Island island) {
		
		int numberOfRabbits = randomNum(5,10); // so that 5 to 10 rabbits will be generated on the island
		
		for (int i = 0; i < numberOfRabbits; i++) {
			int randomX = randomNum(0, islands.get(0).getWidth());
			int randomY = randomNum(0, islands.get(0).getLength());
			Rabbit newRabbit = new Rabbit(randomX, randomY);
			island.getLivingThings().add(newRabbit);
		}
	}
	
	// genrates grass at random positions on an island
	private void generateGrass(Island island) {
		for (int i = 0; i < 30; i++) {
			int randomX = randomNum(0, islands.get(0).getWidth());
			int randomY = randomNum(0, islands.get(0).getLength());
			Grass newGrass = new Grass(randomX, randomY);
			island.getLivingThings().add(newGrass);
		}
	}
	
	
	// genrates kiwi at random positions on an island
		private void generateKiwi(Island island) {
			for (int i = 0; i < 10; i++) {
				int randomX = randomNum(0, islands.get(0).getWidth());
				int randomY = randomNum(0, islands.get(0).getLength());
				Kiwi newKiwi = new Kiwi(randomX, randomY);
				island.getLivingThings().add(newKiwi);
			}
		}
		
	
	
	public void testIsland() {
		System.out.println(islands.get(0).getLength() + " " + islands.get(0).getWidth());
		for (Island i: islands) {
			ArrayList<LivingThing> rabbits = i.getLivingThings();
			for (LivingThing lt: rabbits) {
				if (lt instanceof Rabbit) {
					Rabbit r = ((Rabbit) lt);
					System.out.println(r.getDirection());
				}
				
			}
		}
	}
	
	private int randomNum(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
