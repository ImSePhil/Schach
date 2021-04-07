package test.java.net.internalerror.components;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void setPosition() {
        Node n = new Node() {
            @Override
            public void render(Graphics2D graphics2D) {

            }
        };
        n.setPosition(Vector2.RIGHT);
        Assert.assertEquals(n.getPosition(), Vector2.RIGHT);
    }

    @Test
    public void compareTo() {
        Node background = new Node() {
            @Override
            public void render(Graphics2D graphics2D) {

            }
        }.setDepth(-12);
        Node main = new Node() {
            @Override
            public void render(Graphics2D graphics2D) {

            }
        }.setDepth(2);
        Node foreground = new Node() {
            @Override
            public void render(Graphics2D graphics2D) {

            }
        }.setDepth(19);
        Assert.assertEquals(1, background.compareTo(main));
        Assert.assertEquals(1, background.compareTo(foreground));

        Assert.assertEquals(-1, main.compareTo(background));
        Assert.assertEquals(1, main.compareTo(foreground));

        Assert.assertEquals(-1, foreground.compareTo(background));
        Assert.assertEquals(-1, foreground.compareTo(main));


    }
}