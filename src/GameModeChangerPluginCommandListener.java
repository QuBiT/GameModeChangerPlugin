public class GameModeChangerPluginCommandListener extends PluginListener {

	@Override
	public boolean onCommand(final Player player, final java.lang.String[] split) {

		String input = split[0];

		for (GameModeCommand command : GameModeCommand.values()) {

			boolean commandFound = command.asString().equals(input);
			if (commandFound) {
				command.perform(new PluginUserImpl(player));
				return true;
			}
		}
		return false;
	}
}
