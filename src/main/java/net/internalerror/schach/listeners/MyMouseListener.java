package main.java.net.internalerror.schach.listeners;

import main.java.net.internalerror.schach.util.Vector2;

import java.awt.event.MouseEvent;

public class MyMouseListener {
    private final boolean[] buttons;
    private static MyMouseListener self;
    private final Vector2 lastAbsoluteClick;
    private final Vector2 lastRelativeClick;
    private final Vector2 lastAbsolutePosition;
    private final Vector2 lastRelativePosition;

    private MyMouseListener() {
        this.buttons = new boolean[5];
        lastAbsoluteClick = Vector2.ZERO();
        lastRelativeClick = Vector2.ZERO();
        lastAbsolutePosition = Vector2.ZERO();
        lastRelativePosition = Vector2.ZERO();
    }

    public static boolean isButtonPressed(int button) {
        if (button - 1 > 4) return false;
        return getSelf().buttons[button - 1];
    }

    public static Vector2 getLastAbsoluteClick() {
        //return getSelf().lastAbsoluteClick;
        return null;
    }

    public static Vector2 getLastRelativeClick() {
        //return getSelf().lastRelativeClick;
        return null;
    }

    public static Vector2 getLastAbsolutePosition() {
        //return getSelf().lastAbsolutePosition;
        return null;
    }

    public static Vector2 getLastRelativePosition() {
        //return getSelf().lastRelativePosition;
        return null;
    }

    public static MyMouseListener getSelf() {
        if (self == null)
            self = new MyMouseListener();
        return self;
    }

    public static void mouseClicked(MouseEvent e) {
        // Does nothing, because its not needed yet.
    }

    public static void mousePressed(MouseEvent e) {
        int btn = e.getButton() - 1;
        if (btn > 4) return;
        getSelf().buttons[btn] = true;
        getSelf().lastAbsoluteClick.set(e.getXOnScreen(), e.getYOnScreen());
        getSelf().lastRelativeClick.set(e.getX(), e.getY());
    }

    public static void mouseReleased(MouseEvent e) {
        int btn = e.getButton() - 1;
        if (btn > 4) return;
        getSelf().buttons[btn] = false;
    }

    public static void mouseExited(MouseEvent e) {
        // Does nothing, because its not needed yet.
    }

    public static void mouseMoved(MouseEvent e) {
        getSelf().lastAbsolutePosition.set(e.getXOnScreen(), e.getYOnScreen());
        getSelf().lastRelativePosition.set(e.getX(), e.getY());
    }

    public static void mouseDragged(MouseEvent e) {
        //Does nothing, because its not needed yet.
    }

    public static void mouseEntered(MouseEvent e) {
        // Does nothing, because its not needed yet.
    }
}
