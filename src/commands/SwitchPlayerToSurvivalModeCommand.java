package commands;

import actions.Action;
import actions.SwitchPlayerToSurvivalMode;
import entities.PluginUser;

public class SwitchPlayerToSurvivalModeCommand extends Command {

	private static final String	MESSAGE	= "Successfully switched to Survival Mode";

	public SwitchPlayerToSurvivalModeCommand(final String commandString, final String commandDescription) {
		super(commandString, commandDescription);
		getActionList().add(new SwitchPlayerToSurvivalMode());
	}

	@Override
	protected void performCommandFor(final PluginUser player) {
		for (Action action : getActionList()) {
			action.performActionFor(player);
		}
	}

	@Override
	protected String getCommandSuccessfulMessage() {
		return MESSAGE;
	}

}
