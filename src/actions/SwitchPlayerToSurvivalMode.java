package actions;

import entities.PluginUser;

public class SwitchPlayerToSurvivalMode extends Action {

	@Override
	public void performActionFor(final PluginUser player) {
		player.setCreativeMode(0);
	}

}
