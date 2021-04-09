package main.java.net.internalerror.schach.game.local.components;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public class ChessBoard extends Node {
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
