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
	}
	
	public void testIsland() {
		System.out.println(islands.get(0).getLength() + " " + islands.get(0).getWidth());
	}

}
