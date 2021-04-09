package main.java.net.internalerror.schach.components.functional;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.components.shape.Rectangle;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public class Button extends Node {
    private Label label = new Label();
    private Rectangle rectangle = new Rectangle();
    private Vector2 size = Vector2.ZERO;

    public Vector2 getSize() {
        return size;
    }

    public Button setSize(Vector2 size) {
        this.size = size;
        label.setSize(size);
        rectangle.setSize(size);
        return this;
    }

    public Button() {
        this.setSize(new Vector2(100));
        this.setDepth(1);
        this.rectangle.setBordered(true);
        this.rectangle.setBorderColor(Color.black);
    }

    @Override
    public Button setPosition(Vector2 position) {
        this.position = position;
        label.setPosition(position);
        rectangle.setPosition(position);
        return this;
    }

    @Override
    public void render(Graphics2D graphics2D) {

    }

    @Override
    public Button setDepth(int depth) {
        this.depth = depth;
        label.setDepth(depth - 1);
        rectangle.setDepth(depth);
        return this;
    }

    public Button configureRectangle(Vector2 position, Vector2 size, Vector2 arc, Color borderColor, Color fillColor, Boolean rounded, Boolean filled, Boolean bordered) {
        if(size != null)this.rectangle.setSize(size);
        if(arc != null)this.rectangle.setArc(arc);
        if(borderColor != null)this.rectangle.setBorderColor(borderColor);
        if(fillColor != null)this.rectangle.setFillColor(fillColor);
        if(rounded != null)this.rectangle.setRounded(rounded);
        if(filled != null)this.rectangle.setFilled(filled);
        if(bordered != null)this.rectangle.setBordered(bordered);
        if(position != null)this.rectangle.setPosition(position);
        return this;
    }

    public Button configureLabel(Vector2 position, String text, Font font, Color fontColor, Vector2 size) {
        if (size != null) this.label.setSize(size);
        if (font != null) this.label.setFont(font);
        if (text != null) this.label.setText(text);
        if (fontColor != null) this.label.setFontColor(fontColor);
        if (position != null) this.label.setPosition(position);
        return this;
    }

}
