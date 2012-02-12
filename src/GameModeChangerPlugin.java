import java.util.logging.Logger;

public class GameModeChangerPlugin extends Plugin {

	private static final Logger	LOGGER					= Logger.getLogger("Minecraft");
	private static final String	name					= "GameModeChangerPlugin";
	private static final String	version					= "0.0.2";
	private static final String	PLUGIN_DISABLED_MESSAGE	= name + " version " + version + " is now disabled.";
	private static final String	PLUGIN_ENABLED_MESSAGE	= name + " version " + version + " is now enabled.";

	// private final GameModeChangerPluginConfig config = new GameModeChangerPluginConfig(this);

	public GameModeChangerPlugin() {
		super();
	}

	@Override
	public void initialize() {
		// Add your initialization code here.

	}

	@Override
	public synchronized void disable() {
		// Add your disabling code here.
		removeCommandsFromHelpMenu();
		LOGGER.info(PLUGIN_DISABLED_MESSAGE);

	}

	@Override
	public void enable() {
		// Add your enable code here.
		addCommandsToHelpMenu();

		GameModeChangerPluginCommandListener listener = new GameModeChangerPluginCommandListener();
		GameModeChangerPluginLoginListener loginListener = new GameModeChangerPluginLoginListener();
		etc.getLoader().addListener(PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.MEDIUM);
		etc.getLoader().addListener(PluginLoader.Hook.LOGIN, loginListener, this, PluginListener.Priority.MEDIUM);
		LOGGER.info(PLUGIN_ENABLED_MESSAGE);
	}

	/**
	 * Adds all {@link GameModeCommand}s to the help menu.
	 */
	private void addCommandsToHelpMenu() {
		for (GameModeCommand command : GameModeCommand.values()) {
			etc.getInstance().addCommand(command.asString(), command.getDescription());
		}
	}

	/**
	 * Removes all {@link GameModeCommand}s from the help menu.
	 */
	private void removeCommandsFromHelpMenu() {
		for (GameModeCommand command : GameModeCommand.values()) {
			etc.getInstance().removeCommand(command.asString());
		}
	}

}