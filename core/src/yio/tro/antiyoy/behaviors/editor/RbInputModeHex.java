package yio.tro.antiyoy.behaviors.editor;

import yio.tro.antiyoy.ButtonYio;
import yio.tro.antiyoy.LevelEditor;
import yio.tro.antiyoy.behaviors.ReactBehavior;

/**
 * Created by ivan on 27.11.2015.
 */
public class RbInputModeHex extends ReactBehavior {

    @Override
    public void reactAction(ButtonYio buttonYio) {
        getGameController(buttonYio).getLevelEditor().setInputMode(LevelEditor.MODE_SET_HEX);
        getGameController(buttonYio).getLevelEditor().setInputColor(buttonYio.id - 150);
    }
}
