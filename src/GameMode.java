enum GameMode {
	SURVIVAL("smode"), CREATIVE("cmode");
	
	private static final String SLASH ="/";
	
	private String switchToModeCommand;
	GameMode(String command){
		switchToModeCommand = SLASH+command;
	}
	
	String getCommandAsString(){
		return switchToModeCommand;
	}
}
