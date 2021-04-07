package main.java.net.internalerror.schach.components;

import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public abstract class Node implements Comparable<Node> {
    private Vector2 position;

    private int depth = 0;

    protected Node() {
        position = Vector2.ZERO;
    }

    public Vector2 getPosition() {
        return position;
    }

    public <T extends Node> T setPosition(Vector2 position) {
        this.position = position;
        return (T) this;
    }

    public abstract void render(Graphics2D graphics2D);

    public int getDepth() {
        return depth;
    }

    public <T extends Node> T setDepth(int depth) {
        this.depth = depth;
        return (T) this;
    }

    @Override
    public int compareTo(Node o) { //NOSONAR
        return Integer.compare(o.depth, depth);
    }
}
