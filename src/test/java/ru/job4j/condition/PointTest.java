package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.99);

    }

    @Test
    public void when12To46Then5() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 6;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.99);

    }

    @Test
    public void when11To05Then4() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 0;
        int y2 = 5;
        int expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.99);

    }

    @Test
    public void when23To46Then3() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 6;
        int expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.99);

    }
}