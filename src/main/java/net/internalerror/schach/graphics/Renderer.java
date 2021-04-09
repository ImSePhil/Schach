package main.java.net.internalerror.schach.graphics;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.window.Window;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/**
 * The type Renderer.
 */
public class Renderer {
    private static Renderer self;
    private final List<Node> nodes;

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
        Collections.sort(getSelf().nodes);
        getSelf().nodes.forEach(n -> n.render(graphics2D));
    }

    public static void registerNode(Node node) {
        getSelf().nodes.add(node);
    }
}
