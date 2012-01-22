public class GameModeChangerPluginCommandListener extends PluginListener {
	
    private static final String CREATIVE_MODE_COMMAND = GameMode.CREATIVE.getCommandAsString();
    private static final String SURVIVAL_MODE_COMMAND = GameMode.SURVIVAL.getCommandAsString();
	
	public boolean onCommand(Player player, java.lang.String[] split) {
		
		String command = split[0];
		
		if (command.equals(CREATIVE_MODE_COMMAND)){
			enableCreativeModeFor(player);
			return true;
		}
		
		if(command.equals(SURVIVAL_MODE_COMMAND)){
			enableSurvivalModeFor(player);
			return true;
		}
		
	return false;
	}

	
	private void enableCreativeModeFor(Player player) {
		player.setCreativeMode(1);
		notifyPlayerAboutGameModeChange(player, GameMode.CREATIVE);
	}

	private void enableSurvivalModeFor(Player player){
		player.setCreativeMode(0);
		notifyPlayerAboutGameModeChange(player, GameMode.SURVIVAL);
	}
	
	private void notifyPlayerAboutGameModeChange(Player player, GameMode gameMode) {
		player.sendMessage("You are now in "+gameMode.name()+ " mode.");
		
	}

}