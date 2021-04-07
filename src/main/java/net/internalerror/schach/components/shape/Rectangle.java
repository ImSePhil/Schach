package main.java.net.internalerror.schach.components.shape;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public class Rectangle extends Node {
    protected Vector2 size;
    protected Vector2 arc;
    protected Color borderColor;
    protected Color fillColor;
    protected boolean rounded = false;
    protected boolean filled = false;
    protected boolean bordered = false;

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
        if (filled) {
            graphics2D.setColor(fillColor);
            if (rounded) {
                graphics2D.fillRoundRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY(), (int) arc.getX(), (int) arc.getY());
                if (bordered) {
                    graphics2D.setColor(borderColor);
                    graphics2D.drawRoundRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY(), (int) arc.getX(), (int) arc.getY());
                }
            } else {
                graphics2D.fillRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY());
                if (bordered) {
                    graphics2D.setColor(borderColor);
                    graphics2D.drawRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY());
                }
            }
        } else {
            graphics2D.setColor(borderColor);
            if (rounded) {
                graphics2D.drawRoundRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY(), (int) arc.getX(), (int) arc.getY());
            } else {
                graphics2D.drawRect((int) position.getX(), (int) position.getY(), (int) size.getX(), (int) size.getY());
            }
        }
    }

    @Override
    public Rectangle setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public Rectangle setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public Rectangle setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public boolean isRounded() {
        return rounded;
    }

    public Rectangle setRounded(boolean rounded) {
        this.rounded = rounded;
        return this;
    }

    public boolean isFilled() {
        return filled;
    }

    public Rectangle setFilled(boolean filled) {
        this.filled = filled;
        return this;
    }

    public boolean isBordered() {
        return bordered;
    }

    public Rectangle setBordered(boolean bordered) {
        this.bordered = bordered;
        return this;
    }

    public Vector2 getArc() {
        return arc;
    }

    public Rectangle setArc(Vector2 arc) {
        this.arc = arc;
        return this;
    }
}
