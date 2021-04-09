package test;


import main.java.net.internalerror.schach.util.Vector2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;

import static test.RunAllTests.LOGGER;

public class Vector2Test {

    private Vector2 testVector;

    @Before
    public void createTestVector() {
        LOGGER.log(Level.INFO, "Creating new TestVector2");
        testVector = new Vector2(15, 15);
    }


    @Test
    public void isBetween() {
        LOGGER.log(Level.INFO, "checking if TestVector is between (10, 10) and (20, 20)");
        Vector2 higher = new Vector2(20, 20);
        Vector2 smaller = new Vector2(10, 10);
        Assert.assertTrue(testVector.isBetween(smaller, higher));
        setTestVectorTo(25);
        Assert.assertFalse(testVector.isBetween(smaller, higher));
        setTestVectorTo(5);
        Assert.assertFalse(testVector.isBetween(smaller, higher));
        setTestVectorTo(15, 5);
        Assert.assertFalse(testVector.isBetween(smaller, higher));
        setTestVectorTo(25, 5);
        Assert.assertFalse(testVector.isBetween(smaller, higher));
        setTestVectorTo(5, 15);
        Assert.assertFalse(testVector.isBetween(smaller, higher));
        setTestVectorTo(5, 25);
        Assert.assertFalse(testVector.isBetween(smaller, higher));
    }

    private void setTestVectorTo(float x, float y) {
        LOGGER.log(Level.INFO, "setTestVector to " + testVector);
        testVector.set(x, y);

    }

    private void setTestVectorTo(float size) {
        LOGGER.log(Level.INFO, "setTestVector to " + testVector);
        testVector.set(size);
    }

    @Test
    public void add() {
        LOGGER.log(Level.INFO, "adding (10, 10) to TestVector");
        testVector.add(new Vector2(10, 10));
        Assert.assertEquals(25.0f, testVector.getX(), 0.0f);
        Assert.assertEquals(25.0f, testVector.getY(), 0.0f);
    }

    @Test
    public void plus() {
        LOGGER.log(Level.INFO, "adding (10, 10) to TestVector and recieve a new Vector");
        Vector2 t = testVector.plus(new Vector2(10, 10));
        Assert.assertEquals(25.0f, t.getX(), 0.0f);
        Assert.assertEquals(25.0f, t.getY(), 0.0f);
        Assert.assertEquals(15.0f, testVector.getX(), 0.0f);
        Assert.assertEquals(15.0f, testVector.getY(), 0.0f);
    }

    @Test
    public void isHigherThan() {
        LOGGER.log(Level.INFO, "checking if TestVector is higher than (10, 10)");
        Vector2 higher = new Vector2(20, 20);
        Vector2 smaller = new Vector2(10, 10);
        Assert.assertFalse(testVector.isHigherThan(higher));
        Assert.assertTrue(testVector.isHigherThan(smaller));
    }

    @Test
    public void isLowerThan() {
        LOGGER.log(Level.INFO, "checking if TestVector is lower than (20, 20)");
        Vector2 higher = new Vector2(20, 20);
        Vector2 smaller = new Vector2(10, 10);
        Assert.assertFalse(testVector.isLowerThan(smaller));
        Assert.assertTrue(testVector.isLowerThan(higher));
    }

    @Test
    public void setX() {
        LOGGER.log(Level.INFO, "setting TestVector to (100, ?)");
        testVector.setX(100);
        Assert.assertEquals(100.0f, testVector.getX(), 0.0f);
    }

    @Test
    public void setY() {
        LOGGER.log(Level.INFO, "setting TestVector to (?, 100)");
        testVector.setY(100);
        Assert.assertEquals(100.0f, testVector.getY(), 0.0f);
    }

    @Test
    public void set() {
        LOGGER.log(Level.INFO, "setting TestVector to (100, 100)");
        testVector.set(100);
        Assert.assertEquals(100.0f, testVector.getX(), 0.0f);
        Assert.assertEquals(100.0f, testVector.getY(), 0.0f);
    }

    @Test
    public void multiplyBy() {
        LOGGER.log(Level.INFO, "multiplying TestVector by 3");
        testVector.set(15, 25);
        testVector.multiplyBy(5);
        Assert.assertEquals(5 * 15, testVector.getX(), 0);
        Assert.assertEquals(5 * 25, testVector.getY(), 0);
    }

    @Test
    public void divideBy() {
        LOGGER.log(Level.INFO, "dividing TestVector by 7");
        testVector.set(49, 63);
        testVector.divideBy(7);
        Assert.assertEquals(49 / 7, testVector.getX(), 0);
        Assert.assertEquals(63 / 7, testVector.getY(), 0);
    }
}