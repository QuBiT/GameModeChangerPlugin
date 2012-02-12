package actions;

import entities.PluginUser;

public class SwitchPlayerToCreativeMode extends Action {

	@Override
	public void performActionFor(final PluginUser player) {
		player.setCreativeMode(1);
	}

}
