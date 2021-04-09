package main.java.net.internalerror.schach.game.local.components;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.game.local.components.figures.Figure;
import main.java.net.internalerror.schach.game.local.components.figures.Pawn;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;
import java.util.List;

public class ChessBoard extends Node {
    private Tile[][] board = new Tile[8][8];
    private Figure[][] figures = new Figure[8][8];
    private static ChessBoard self;


    public ChessBoard() {
        Color bg = new Color(173, 173, 173);
        Color dtile = new Color(74, 74, 74);
        Color ltile = new Color(205, 205, 205);


        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Vector2 tileSize = new Vector2(100);
                Vector2 tilePosition = new Vector2(position.getX() + x * tileSize.getX(), position.getY() + y * tileSize.getY());
                Color color = ltile;
                if ((x + y) % 2 == 1) {
                    color = dtile;
                }
                board[y][x] = new Tile().setSize(tileSize).configureBackground(tilePosition, tileSize, null, null, bg, false, true, false).configureForeground(tilePosition.plus(new Vector2(5)), tileSize.getMultipliedBy(.90f), new Vector2(20), null, color, true, true, false);
            }
        }
        new Pawn(new Vector2(20), 0, 0, Color.RED);
        self = this;
    }

    private static ChessBoard getSelf() {
        return self;
    }

    public static void showPossibleMoves(List<Vector2> moves) {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (getSelf().board[y][x] != null)
                    getSelf().board[y][x].highlight(false);
            }
        }
        moves.forEach(m -> {
            getSelf().board[(int) m.getY()][(int) m.getY()].highlight(true);
        });
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

