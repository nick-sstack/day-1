package com.smoothstack.dayfour.assignmentfour;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    Line line1 = new Line(21.3, 49.189, 10.494, 48.19);
    Line line2 = new Line(84.363, 1152.53, 5165.321, 77.36);
    Line line3 = new Line(25.3, 53.189, 14.494, 52.19);
    Line line4 = new Line(12, 12, 12, 12);

    @Test
    public void testGetDistance() {
        assertEquals(10.8521, line1.getDistance(), .001);
    }

    @Test
    public void testDivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> line4.getSlope());
    }

    @Test
    public void testSlope() {
        assertEquals(0.09245, line1.getSlope(), .001);
    }

    @Test
    public void testParallel() {
        assertTrue(line1.parallelTo(line3));
    }

    @Test
    public void testNotParallel() {
        assertFalse(line1.parallelTo(line2));
    }
}
