package main.java.net.internalerror.schach.graphics;

import main.java.net.internalerror.schach.components.Node;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The type Renderer.
 */
public class Renderer {
    private static Renderer self;
    private final List<Node> nodes;
    private Graphics2D graphics2D;

    /**
     * Gets self.
     *
     * @return the self
     */
    public static Renderer getSelf() {
        if (self == null)
            self = new Renderer();
        return self;
    }

    private Renderer() {
        nodes = new ArrayList<>();
    }

    /**
     * Render.
     *
     * @param graphics2D the graphics 2 d
     */
    public static void render(Graphics2D graphics2D) {
        getSelf().sort();
        getSelf().nodes.forEach(n -> n.render(graphics2D));
    }

    private void sort() {
        Collections.sort(nodes);
    }

    public static void registerNode(Node node) {
        getSelf().nodes.add(node);
    }
}
