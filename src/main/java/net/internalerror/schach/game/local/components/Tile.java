package main.java.net.internalerror.schach.game.local.components;

import main.java.net.internalerror.schach.Sizable;
import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.components.shape.Rectangle;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;


public class Tile extends Node implements Sizable {
    private Rectangle background;
    private Rectangle foreground;
    private Vector2 size = new Vector2();

    public Tile() {
        background = new Rectangle();
        foreground = new Rectangle();
    }

    @Override
    public Tile setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    @Override
    public void render(Graphics2D graphics2D) {

    }

    @Override
    public Tile setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public Tile setSize(Vector2 size) {
        this.size = size;
        return this;
    }

    public Tile configureForeground(Vector2 position, Vector2 size, Vector2 arc, Color borderColor, Color fillColor, Boolean rounded, Boolean filled, Boolean bordered) {
        if (size != null) this.foreground.setSize(size);
        if (arc != null) this.foreground.setArc(arc);
        if (borderColor != null) this.foreground.setBorderColor(borderColor);
        if (fillColor != null) this.foreground.setFillColor(fillColor);
        if (rounded != null) this.foreground.setRounded(rounded);
        if (filled != null) this.foreground.setFilled(filled);
        if (bordered != null) this.foreground.setBordered(bordered);
        if (position != null) this.foreground.setPosition(position);
        return this;
    }

    public Tile configureBackground(Vector2 position, Vector2 size, Vector2 arc, Color borderColor, Color fillColor, Boolean rounded, Boolean filled, Boolean bordered) {
        if (size != null) this.background.setSize(size);
        if (arc != null) this.background.setArc(arc);
        if (borderColor != null) this.background.setBorderColor(borderColor);
        if (fillColor != null) this.background.setFillColor(fillColor);
        if (rounded != null) this.background.setRounded(rounded);
        if (filled != null) this.background.setFilled(filled);
        if (bordered != null) this.background.setBordered(bordered);
        if (position != null) this.background.setPosition(position);
        return this;
    }
}
