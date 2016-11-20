package yio.tro.antiyoy.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import yio.tro.antiyoy.YioGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		// scaled to phone
		config.width = 360;
		config.height = 640;
		new LwjglApplication(new YioGdxGame(), config);
	}
}
