import java.util.ArrayList;

public class IslandSimulator {
	
	private static ArrayList<Island> islands = new ArrayList<Island>();
	
	public IslandSimulator(int numberOfIslands) {
		for (int i = 0; i < numberOfIslands; i++) {
			generateIsland();
		}
	}
	
	public void generateIsland() {
		islands.add(new Island());
		for (Island i: islands) {
			generateRabbits(i);
		}
	}
	
	// generates rabbits at random positions on the island
	public void generateRabbits(Island island) {
		
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
	
	public int randomNum(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
