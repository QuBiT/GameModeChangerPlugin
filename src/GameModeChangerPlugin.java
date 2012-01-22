import java.util.logging.Logger;

public class GameModeChangerPlugin extends Plugin {

	private static final Logger LOGGER = Logger.getLogger("Minecraft");
	private static final String name = "GameModeChangerPlugin";
	private static final String version = "0.0.1";

	//private final GameModeChangerPluginConfig config = new GameModeChangerPluginConfig(this);
	
	public GameModeChangerPlugin() {
		super();
		
		
	}

	public void initialize() {
		// Add your initialization code here.
		
	}
	
	public synchronized void disable() {
		// Add your disabling code here.
		LOGGER.info(name + " version " + version + " is disabled!");
	}
	
	public void enable() {
		// Add your enable code here.

		GameModeChangerPluginCommandListener listener = new GameModeChangerPluginCommandListener();
		GameModeChangerPluginLoginListener loginListener = new GameModeChangerPluginLoginListener();
		etc.getLoader().addListener( PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.MEDIUM);
		etc.getLoader().addListener( PluginLoader.Hook.LOGIN, loginListener, this, PluginListener.Priority.MEDIUM);
		LOGGER.info(name + " version " + version + " is enabled!" );
		
	}}