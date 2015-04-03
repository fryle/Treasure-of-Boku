package com.android.Treasure_Of_Boku;

import android.gameengine.icadroids.engine.GameEngine;
import android.gameengine.icadroids.input.OnScreenButtons;
import android.gameengine.icadroids.input.TouchInput;

/**
 * Main class of the game.
 * 
 * @author Jonathan Daniel
 */
public class Main extends GameEngine {

    private Level level;
	/**
	 * Initialize the game, create objects and level
	 * 
	 * @see android.gameengine.icadroids.engine.GameEngine#initialize()
	 */
	@Override
	protected void initialize() {
        OnScreenButtons.use = true;
        TouchInput.use = true;
        level = new Level(10);
	}

	/**
	 * @see android.gameengine.icadroids.engine.GameEngine#update()
	 */
	@Override
	public void update() {
		super.update();
       setTileMap(level.getLevelTile());

	}
}