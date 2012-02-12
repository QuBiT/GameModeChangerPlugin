package entities;

/**
 * Methods used on player objects inside this plugin.
 * 
 * @author QuBiT
 * 
 */
public interface PluginUser {

	/**
	 * forwards the game mode to the player entity
	 * 
	 * @param mode
	 */
	void setCreativeMode(int mode);

	/**
	 * forwards the message to the player entity
	 * 
	 * @param message
	 */
	void sendMessage(String message);
}
