public class GameModeChangerPluginLoginListener extends PluginListener {

	private static final String INFO_MESSAGE = "To switch to CREATIVE mode use '/cmode'. To switch back to SURVIVAL use '/smode'.";
	public void onLogin(Player player) {
		sendPluginInfoMessage(player);
	}
	
	private void sendPluginInfoMessage(Player player) {
		String infoMessage = "Hi "+player.getName()+"! "+INFO_MESSAGE;
		player.sendMessage(infoMessage);
	}

}
