package com.android.Treasure_Of_Boku;

import android.gameengine.icadroids.tiles.GameTiles;

/**
 *
 * Created by Jimmy Feltsadas on 24-3-15.
 *
 */
public class Level {


    /**
     *
     */
    private GameTiles LevelTiles;
    /**
     * The width of a level
     */
    private int LevelWidth;

    /**
     * The height of a level
     */
    private int LevelHeight;

    /**
     * The tiles images that are being used
     * 0 = Sky
     * 1 = Top ground
     * 2 = middle ground
     * 3 = bottom ground
     */
    private String[] tileImages;

    /**
     * Size of the tiles
     */
    private int tileSize;

    /**
     *  The map array for the tiles
     */
    private int[][] tilemap;

    /**
     * This is used if you want custom settings and not just the width of the game
     * @param LevelWidth Sets the width of the level
     * @param LevelHeight Sets the height of the level
     * @param tileImages Sets which tile images wants to be used
     * @param tileSize  Sets how big a tile is
     */

    public Level(int LevelWidth, int LevelHeight, String[] tileImages, int tileSize, String args) {
        this.LevelWidth = LevelWidth;
        this.LevelHeight = LevelHeight;
        this.tileImages = tileImages;
        this.tileSize = tileSize;
        tilemap = new int[LevelHeight][LevelWidth];
        if (args == "default" || args =="Default")
            fillTileMapDefault();
        else if (args == "single tile")
            fillTileMapSingleTile();
        LevelTiles = new GameTiles(tileImages, tilemap, tileSize);
    }

    /**
     * This constructor is used if you want to use the default tiles and just want to adjust the width.
     * @param LevelWidth Sets the width of the level
     */
    public Level(int LevelWidth) {
        this.LevelWidth = LevelWidth;
        LevelHeight = 9;
        tileImages = new String[] {"blue_tile", "grass_tile", "brown_middle_tile", "brown_bottom_tile"};
        tileSize = 120;
        tilemap = new int[LevelHeight][LevelWidth];
        fillTileMapDefault();
        LevelTiles = new GameTiles(tileImages, tilemap, tileSize);

    }

    private void fillTileMapDefault() {
        for (int i = 0; i < LevelHeight; i++) {
            for (int j = 0; j < LevelWidth; j++) {
                if (i == LevelHeight -1)
                    tilemap[i][j] = 3;
                else if (i == LevelHeight -2)
                    tilemap[i][j] = 2;
                else if (i == LevelHeight -3)
                    tilemap[i][j] = 1;
                else
                    tilemap[i][j] = 0;
            }
        }
    }

    private void fillTileMapSingleTile() {
        for (int i = 0; i < LevelHeight; i++) {
            for (int j = 0; j < LevelWidth; j++) {
                tilemap[i][j] = 0;
            }
        }
    }
    public GameTiles getLevelTile() {
        return LevelTiles;
    }


}
