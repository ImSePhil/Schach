package main.java.net.internalerror.schach.util;

/**
 * The type Vector 2.
 */
public class Vector2 implements Comparable<Vector2> {
    private float x;
    private float y;

    /**
     * The constant LEFT.
     */
    public static final Vector2 LEFT = new Vector2(-1, 0);
    /**
     * The constant RIGHT.
     */
    public static final Vector2 RIGHT = new Vector2(1, 0);
    /**
     * The constant ZERO.
     */
    public static final Vector2 ZERO = new Vector2(0, 0);
    /**
     * The constant DOWN.
     */
    public static final Vector2 DOWN = new Vector2(0, 1);
    /**
     * The constant UP.
     */
    public static final Vector2 UP = new Vector2(0, -1);

    /**
     * Instantiates a new Vector 2.
     */
    public Vector2() {
        this.setX(0.0f);
        this.setY(0.0f);
    }

    public Vector2(float size) {
        this.x = size;
        this.y = size;
    }

    /**
     * Instantiates a new Vector 2.
     *
     * @param x the x
     * @param y the y
     */
    public Vector2(float x, float y) {
        this.setX(x);
        this.setY(y);
    }


    @Override
    public int compareTo(Vector2 that) { //NOSONAR
        if (this.getX() < that.getX()) {
            return -1;
        } else if (this.getX() > that.getX()) {
            return 1;
        }

        if (this.getY() < that.getY()) {
            return -1;
        } else if (this.getY() > that.getY()) {
            return 1;
        }
        return 0;
    }

    public boolean isBetween(Vector2 minPosition, Vector2 maxPosition) {
        if (this.x > maxPosition.x) return false;
        if (this.x < minPosition.x) return false;
        if (this.y > maxPosition.y) return false;
        if (this.y < minPosition.y) return false;


        return true;
    }

    /**
     * Add.
     *
     * @param other the other
     */
    public Vector2 add(Vector2 other) {
        setX(getX() + other.getX());
        setY(getY() + other.getY());
        return this;
    }

    public Vector2 plus(Vector2 other) {
        return new Vector2(other.x + x, other.y + y);
    }

    public boolean isHigherThan(Vector2 other) {
        if (x < other.x) return false;
        if (y < other.y) return false;
        return true;
    }

    public boolean isLowerThan(Vector2 other) {
        if (x > other.x) return false;
        if (y > other.y) return false;
        return true;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(float y) {
        this.y = y;
    }

    public void set(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public void set(float size) {
        this.setX(size);
        this.setY(size);
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}