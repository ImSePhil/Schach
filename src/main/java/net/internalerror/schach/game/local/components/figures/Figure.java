package main.java.net.internalerror.schach.game.local.components.figures;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Figure extends Node {
    private boolean selected;
    private int xTile;
    private int yTile;
    protected List<Vector2> possibleMoves;
    private Color team;

    protected Figure(int xTile, int yTile, Color team) {
        this.team = team;
        possibleMoves = new ArrayList<>();
        this.xTile = xTile;
        this.yTile = yTile;
        selected = false;
    }

    public boolean isSelected() {
        return selected;
    }

    public Figure setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public int getxTile() {
        return xTile;
    }

    public Figure setxTile(int xTile) {
        this.xTile = xTile;
        return this;
    }

    public int getyTile() {
        return yTile;
    }

    public Figure setyTile(int yTile) {
        this.yTile = yTile;
        return this;
    }

    public List<Vector2> getPossibleMoves() {
        return possibleMoves;
    }

    public Figure setPossibleMoves(List<Vector2> possibleMoves) {
        this.possibleMoves = possibleMoves;
        return this;
    }

    public Color getTeam() {
        return team;
    }

    public Figure setTeam(Color team) {
        this.team = team;
        return this;
    }
}
