package main.java.net.internalerror.schach.components.functional;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

import java.awt.*;

public class Label extends Node {
    private String text;
    private Font font;
    private Color fontColor;
    private int fontSize;
    private Vector2 size;

    public Label() {
        this.size = new Vector2(50,50);
        this.text = "Hello world!";
        this.position = Vector2.ZERO;
        this.fontColor = Color.BLACK;
    }

    public Label(Vector2 position, String text, Font font, Color fontColor, int fontSize, Vector2 size) {
        this.text = text;
        this.font = font;
        this.fontColor = fontColor;
        this.fontSize = fontSize;
        this.size = size;
        this.position = position;
    }

    @Override
    public Label setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    @Override
    public void render(Graphics2D graphics2D) {
        graphics2D.setColor(fontColor);
        graphics2D.setFont(font);
        float pivotX = size.getX() / 2 - ((float) graphics2D.getFontMetrics().stringWidth(text)) / 2;
        float pivotY = size.getY() / 2 + ((float) graphics2D.getFontMetrics().getFont().getSize()) / 2;
        graphics2D.drawString(text, position.getX() + pivotX, position.getY() + pivotY);
    }

    @Override
    public Label setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    public Vector2 getSize() {
        return size;
    }

    public Label setSize(Vector2 size) {
        this.size = size;
        return this;
    }

    public String getText() {
        return text;
    }

    public Label setText(String text) {
        this.text = text;
        return this;
    }

    public Font getFont() {
        return font;
    }

    public Label setFont(Font font) {
        this.font = font;
        return this;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public Label setFontColor(Color fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    public int getFontSize() {
        return fontSize;
    }

    public Label setFontSize(int fontSize) {
        this.fontSize = fontSize;
        return this;
    }
}
