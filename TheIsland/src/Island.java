import java.util.ArrayList;

public class Island {
	private final int width = 100;
	private final int length = 100;
	
	private ArrayList<LivingThing> livingThings = new ArrayList<LivingThing>();
	
	public Island() {
	}
	
	public void simulateRound() {
		
	}
	

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}




	public ArrayList<LivingThing> getLivingThings() {
		return livingThings;
	}




	public void setLivingThings(ArrayList<LivingThing> livingThings) {
		this.livingThings = livingThings;
	}
	
	
	
}
