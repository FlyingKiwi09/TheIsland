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
	
	public void generateRabbits(Island i) {
		int randomX = randomNum(0, islands.get(0).getWidth());
		int randomY = randomNum(0, islands.get(0).getLength());
		Rabbit newRabbit = new Rabbit(randomX, randomY);
		
		i.getLivingThings().add(newRabbit);
	}
	
	public void testIsland() {
		System.out.println(islands.get(0).getLength() + " " + islands.get(0).getWidth());
	}
	
	public int randomNum(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
