package main.java.net.internalerror.schach.components;

import main.java.net.internalerror.schach.graphics.Renderer;
import main.java.net.internalerror.schach.listeners.MyMouseListener;
import main.java.net.internalerror.schach.util.Vector2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The type Panel.
 */
public class Panel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
    /**
     * The Timer.
     */
    Timer timer;

    /**
     * Instantiates a new Panel.
     *
     * @param size the size
     */
    public Panel(Vector2 size) {
        setPreferredSize(new Dimension((int) size.getX(), (int) size.getY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        Renderer.render(graphics2D);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        timer = new Timer(8, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    private void update() {
        //Renderer.update();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        MyMouseListener.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        MyMouseListener.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        MyMouseListener.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        MyMouseListener.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        MyMouseListener.mouseExited(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        MyMouseListener.mouseDragged(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        MyMouseListener.mouseMoved(e);
    }
}
