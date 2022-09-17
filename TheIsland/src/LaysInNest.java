/**
 * LaysInNest interface extends LaysEggs and allows classes to implement methods to build nests and incubate eggs.
 * <p>  
 * This interface is for all animals that lay eggs and build nests in the island simulator. 
 * 
 * @author Alina Hookway
 * @version 1.0
 * @since 1.0
 */
public interface LaysInNest extends LaysEggs {
	public void buildNest();
	public void incubate();
}
