package main.java.net.internalerror.schach.game.local.components;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public class ChessBoard extends Node {
    public ChessBoard() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Vector2 tileSize = new Vector2(100);
                Vector2 tilePosition = new Vector2(position.getX() + x * tileSize.getX(), position.getY() + y * tileSize.getY());
                Color color = Color.black;
                if ((x + y) % 2 == 1) {
                    color = Color.WHITE;
                }
                new Tile().setSize(tileSize)
                        .configureBackground(tilePosition, tileSize, null, null, Color.gray, false, true, false)
                        .configureForeground(tilePosition.plus(new Vector2(5)), tileSize.getMultipliedBy(.90f), new Vector2(20), null, color, true, true, false);
            }
        }
    }

    @Override
    public ChessBoard setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    @Override
    public void render(Graphics2D graphics2D) {

    }

    @Override
    public ChessBoard setDepth(int depth) {
        this.depth = depth;
        return this;
    }
}

