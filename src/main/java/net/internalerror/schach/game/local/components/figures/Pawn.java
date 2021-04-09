package main.java.net.internalerror.schach.game.local.components.figures;

import main.java.net.internalerror.schach.Sizable;
import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.components.functional.Label;
import main.java.net.internalerror.schach.components.shape.Rectangle;
import main.java.net.internalerror.schach.game.local.components.ChessBoard;
import main.java.net.internalerror.schach.listeners.MyMouseListener;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;


public class Pawn extends Figure implements Sizable {
    private Rectangle button;
    private Label label;
    private Vector2 size;

    public Pawn(Vector2 position, int xTile, int yTile, Color team) {
        super(xTile, yTile, team);
        size = new Vector2(100, 100);
        button = new Rectangle(position, size.getMultipliedBy(.6f), new Vector2(55), null, team, true, true, false);
        label = new Label(position, "PAWN", new Font("TimesRoman", Font.PLAIN, 15), Color.BLACK, 0, size.getMultipliedBy(.6f));
        possibleMoves.add(new Vector2(1));
    }

    @Override
    public Pawn setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    @Override
    public void render(Graphics2D graphics2D) {
        if (MyMouseListener.getLastAbsolutePosition().isBetween(position, position.plus(size.getMultipliedBy(.6F)))) {
            //ChessBoard.showPossibleMoves(getPossibleMoves());
        }


    }

    @Override
    public Pawn setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public <T extends Node> T setSize(Vector2 size) {
        return null;
    }
}
