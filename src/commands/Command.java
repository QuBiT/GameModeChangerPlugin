package commands;

import java.util.ArrayList;

import actions.Action;
import entities.PluginUser;

public abstract class Command {

	private final String			command;
	private final String			description;
	private static final String		SLASH		= "/";
	private final ArrayList<Action>	actionList	= new ArrayList<Action>();

	public ArrayList<Action> getActionList() {
		return actionList;
	}

	public Command(final String commandString, final String commandDescription) {
		command = SLASH + commandString;
		description = commandDescription;
	}

	public void processCommand(final PluginUser player) {
		performCommandFor(player);
		notifyPlayer(player);
	}

	protected abstract void performCommandFor(PluginUser player);

	protected abstract String getCommandSuccessfulMessage();

	public String asString() {
		return command;
	}

	public String getDescription() {
		return description;
	}

	private void notifyPlayer(final PluginUser player) {
		player.sendMessage(getCommandSuccessfulMessage());
	}

}
