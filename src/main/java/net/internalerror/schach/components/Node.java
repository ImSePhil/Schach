package main.java.net.internalerror.schach.components;

import main.java.net.internalerror.schach.graphics.Renderer;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public abstract class Node implements Comparable<Node> {
    protected Vector2 position;

    protected int depth = 0;

    protected Node() {
        position = Vector2.ZERO;
        Renderer.registerNode(this);
    }

    public Vector2 getPosition() {
        return position;
    }

    public abstract <T extends Node> T setPosition(Vector2 position);

    public abstract void render(Graphics2D graphics2D);

    public int getDepth() {
        return depth;
    }

    public abstract <T extends Node> T setDepth(int depth);

    @Override
    public int compareTo(Node o) { //NOSONAR
        return Integer.compare(o.depth, depth);
    }
}
