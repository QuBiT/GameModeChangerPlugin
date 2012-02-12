
import commands.Command;
import commands.SwitchPlayerToCreativeModeCommand;
import commands.SwitchPlayerToSurvivalModeCommand;

import entities.PluginUser;

public enum GameModeCommand {
	SURVIVAL(new SwitchPlayerToSurvivalModeCommand("smode", "This command changes your gamemode to SURVIVAL mode.")),
	CREATIVE(new SwitchPlayerToCreativeModeCommand("cmode", "This command changes your gamemode to CREATIVE mode."));

	private final Command	command;

	GameModeCommand(final Command command) {
		this.command = command;
	}

	Command getCommand() {
		return command;
	}

	public String asString() {
		return command.asString();
	}

	public void perform(final PluginUser player) {
		command.processCommand(player);
	}

	public String getDescription() {
		return command.getDescription();
	}

}
