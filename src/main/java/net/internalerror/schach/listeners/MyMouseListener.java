package main.java.net.internalerror.schach.listeners;

import main.java.net.internalerror.schach.util.Vector2;

import java.awt.event.MouseEvent;

/**
 * The type My mouse listener.
 */
public class MyMouseListener {
    private final boolean[] buttons;
    private static MyMouseListener self;
    private final Vector2 lastAbsoluteClick;
    private final Vector2 lastRelativeClick;
    private final Vector2 lastAbsolutePosition;
    private final Vector2 lastRelativePosition;

    private MyMouseListener() {
        this.buttons = new boolean[5];
        lastAbsoluteClick = Vector2.ZERO;
        lastRelativeClick = Vector2.ZERO;
        lastAbsolutePosition = Vector2.ZERO;
        lastRelativePosition = Vector2.ZERO;
    }

    /**
     * Is button pressed boolean.
     *
     * @param button the button
     * @return the boolean
     */
    public static boolean isButtonPressed(int button) {
        if (button - 1 > 4) return false;
        return getSelf().buttons[button - 1];
    }

    /**
     * Gets last absolute click.
     *
     * @return the last absolute click
     */
    public static Vector2 getLastAbsoluteClick() {
        return getSelf().lastAbsoluteClick;
    }

    /**
     * Gets last relative click.
     *
     * @return the last relative click
     */
    public static Vector2 getLastRelativeClick() {
        return getSelf().lastRelativeClick;
    }

    /**
     * Gets last absolute position.
     *
     * @return the last absolute position
     */
    public static Vector2 getLastAbsolutePosition() {
        return getSelf().lastAbsolutePosition;
    }

    /**
     * Gets last relative position.
     *
     * @return the last relative position
     */
    public static Vector2 getLastRelativePosition() {
        return getSelf().lastRelativePosition;
    }

    /**
     * Gets self.
     *
     * @return the self
     */
    public static MyMouseListener getSelf() {
        if (self == null)
            self = new MyMouseListener();
        return self;
    }

    /**
     * Mouse clicked.
     *
     * @param e the e
     */
    public static void mouseClicked(MouseEvent e) {
        // Does nothing, because its not needed yet.
    }

    /**
     * Mouse pressed.
     *
     * @param e the e
     */
    public static void mousePressed(MouseEvent e) {
        int btn = e.getButton() - 1;
        if (btn > 4) return;
        getSelf().buttons[btn] = true;
        getSelf().lastAbsoluteClick.set(e.getXOnScreen(), e.getYOnScreen());
        getSelf().lastRelativeClick.set(e.getX(), e.getY());
    }

    /**
     * Mouse released.
     *
     * @param e the e
     */
    public static void mouseReleased(MouseEvent e) {
        int btn = e.getButton() - 1;
        if (btn > 4) return;
        getSelf().buttons[btn] = false;
    }

    /**
     * Mouse exited.
     *
     * @param e the e
     */
    public static void mouseExited(MouseEvent e) {
        // Does nothing, because its not needed yet.
    }

    /**
     * Mouse moved.
     *
     * @param e the e
     */
    public static void mouseMoved(MouseEvent e) {
        getSelf().lastAbsolutePosition.set(e.getXOnScreen(), e.getYOnScreen());
        getSelf().lastRelativePosition.set(e.getX(), e.getY());
    }

    /**
     * Mouse dragged.
     *
     * @param e the e
     */
    public static void mouseDragged(MouseEvent e) {
        //Does nothing, because its not needed yet.
    }

    /**
     * Mouse entered.
     *
     * @param e the e
     */
    public static void mouseEntered(MouseEvent e) {
        // Does nothing, because its not needed yet.
    }
}
