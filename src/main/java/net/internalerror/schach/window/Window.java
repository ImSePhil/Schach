package main.java.net.internalerror.schach.window;

import main.java.net.internalerror.schach.components.Panel;
import main.java.net.internalerror.schach.util.Vector2;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

/**
 * The type Window.
 */
public class Window extends JFrame {

    /**
     * Instantiates a new Window.
     *
     * @param name       the name
     * @param windowSize the window size
     */
    public static final Logger LOGGER = Logger.getLogger("Window");

    public Window(String name, Vector2 windowSize) {
        super(name);
        setLayout(new BorderLayout());
        add(new Panel(windowSize));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
