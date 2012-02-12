import entities.PluginUser;

/**
 * Wraps {@link Player} inside {@link PluginUser}
 * 
 * @author QuBiT
 * 
 */
public class PluginUserImpl implements PluginUser {

	final Player	player;

	public PluginUserImpl(final Player player) {
		this.player = player;
	}

	@Override
	public void setCreativeMode(final int mode) {
		player.setCreativeMode(mode);
	}

	@Override
	public void sendMessage(final String message) {
		player.sendMessage(message);
	}

}
