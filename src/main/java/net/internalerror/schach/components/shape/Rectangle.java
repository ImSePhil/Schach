package main.java.net.internalerror.schach.components.shape;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public class Rectangle extends Node {
    protected Vector2 size;

    public Rectangle() {
        this.size = Vector2.ZERO;
    }

    public Rectangle setSize(Vector2 size) {
        this.size = size;
        return this;
    }

    @Override
    public Rectangle setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    @Override
    public void render(Graphics2D graphics2D) {
        graphics2D.drawRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY());
    }

    @Override
    public Rectangle setDepth(int depth) {
        this.depth = depth;
        return this;
    }
}
