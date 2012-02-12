import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

public class GameModeChangerPluginConfig {

	// private final GameModeChangerPlugin plugin;
	private static String	INIFILE	= "plugins/GameModeChangerPlugin/config.ini";

	public GameModeChangerPluginConfig(final GameModeChangerPlugin plugin) {
		// this.plugin = plugin;
		loadIni();
	}

	public void loadIni() {
		File inifile = new File(INIFILE);
		if (inifile.exists()) {
			try {
				Properties iniSettings = new Properties();
				iniSettings.load(new FileInputStream(inifile));

			} catch (Exception e) {
				System.out.println("GameModeChangerPlugin: - file creation failed, using defaults.");
			}
		} else {
			createIni();
		}
	}

	public void createIni() {
		File inifile = new File(INIFILE);
		try {
			inifile.getParentFile().mkdirs();
			BufferedWriter outChannel = new BufferedWriter(new FileWriter(inifile));
			outChannel.write("\n" + "");
			outChannel.close();
		} catch (Exception e) {
			System.out.println("GameModeChangerPlugin: - file creation failed, using defaults.");
		}

	}

	boolean getBoolean(final String value) {
		if (value.equalsIgnoreCase("true")) {
			return true;
		} else {
			return false;
		}
	}

	double getDouble(final String value, final double default1) {
		try {
			return Double.parseDouble(value.trim());
		} catch (Exception e) {
			return default1;
		}
	}

	float getFloat(final String value, final float default1) {
		try {
			return Float.parseFloat(value.trim());
		} catch (Exception e) {
			return default1;
		}
	}

	int getInt(final String value, final int default1) {
		try {
			return Integer.parseInt(value.trim());
		} catch (Exception e) {
			return default1;
		}
	}

	long getLong(final String value, final long default1) {
		try {
			return Long.parseLong(value.trim());
		} catch (Exception e) {
			return default1;
		}
	}
}
