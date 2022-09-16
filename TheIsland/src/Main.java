
public class Main {
	
	static IslandSimulator simulator = new IslandSimulator(1);

	public static void main(String[] args) {
		simulator.generateIsland();
		simulator.testIsland();
		simulator.reportOnIslands();
	}
}
